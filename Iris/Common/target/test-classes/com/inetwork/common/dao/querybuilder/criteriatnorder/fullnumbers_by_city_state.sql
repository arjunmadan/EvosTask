SELECT tn.fullnumber, tn.vendor_id, (select name from vendor where id=tn.vendor_id) vendorName, (select tier from tier where id=rtx.tier_id) tier, tn.rc_abbreviation, tn.rc_state, rtx.rc_lata LATA, rtx.city FROM telephonenumber tn INNER JOIN ratecenter_tier_xref rtx ON rtx.rc_state = tn.rc_state AND rtx.rc_abbreviation = tn.rc_abbreviation AND rtx.rc_supports_new_tns = true INNER JOIN city_ratecenter c ON tn.rc_state = c.rc_state AND tn.rc_abbreviation = c.rc_abbreviation WHERE (tn_status='Available') AND (protected_account_id =:account_id OR protected_account_id IS NULL) AND rtx.tier_id IN (SELECT tier_id FROM account_tier_xref WHERE account_id=:account_id) AND c.city=:city AND c.state=:rc_state ORDER BY tn.fullnumber LIMIT 100