SELECT fullnumber, vendor_id, vendorName, tier, rc_abbreviation, rc_state, lata, city FROM ((SELECT tn.fullnumber, tn_status, tn.vendor_id, (select name from vendor where id=tn.vendor_id) vendorName, (select tier from tier where id=rtx.tier_id) tier, tn.rc_abbreviation,tn.rc_state,rtx.rc_lata LATA, city FROM telephonenumber AS tn INNER JOIN ratecenter_tier_xref AS rtx ON tn.rc_abbreviation=rtx.rc_abbreviation AND tn.rc_state=rtx.rc_state AND tn.vendor_id = rtx.vendor_id AND rtx.rc_supports_new_tns=true WHERE tn.fullnumber LIKE :fullnumber AND (tn_status='Available') AND (protected_account_id IS NULL) and rtx.tier_id IN (SELECT tier_id from account_tier_xref WHERE account_id =:account_id) LIMIT 100) UNION ALL (SELECT tn.fullnumber, tn_status, tn.vendor_id, (select name from vendor where id=tn.vendor_id) vendorName, (select tier from tier where id=rtx.tier_id) tier, tn.rc_abbreviation,tn.rc_state,rtx.rc_lata LATA, city FROM (SELECT DISTINCT rc_abbreviation, rc_state FROM lca_npanxx_ratecenter WHERE npa=:npa AND nxx=:nxx) AS lca INNER JOIN telephonenumber AS tn ON lca.rc_abbreviation=tn.rc_abbreviation AND lca.rc_state=tn.rc_state INNER JOIN ratecenter_tier_xref AS rtx ON tn.rc_abbreviation=rtx.rc_abbreviation AND tn.rc_state=rtx.rc_state AND tn.vendor_id = rtx.vendor_id AND rtx.rc_supports_new_tns=true WHERE tn.fullnumber NOT LIKE :fullnumber AND (tn_status='Available') AND (protected_account_id IS NULL) AND rtx.tier_id IN (SELECT tier_id from account_tier_xref WHERE account_id =:account_id) LIMIT 100)) AS tbl ORDER BY tn_status DESC, fullnumber LIMIT 100