SELECT tn.fullnumber,tn.vendor_id,(select name from vendor where id=tn.vendor_id) vendorName, (select tier from tier where id=rtx.tier_id) tier,nbr.rc_abbreviation,nbr.rc_state,nbr.city,nbr.rc_lata LATA 
FROM npanxx_block_ratecenter AS nbr 
INNER JOIN (SELECT DISTINCT npa,nxx,state FROM npa_nxx_zipcode AS nnz WHERE nnz.zip_code=:zip_code) AS nnz
ON nbr.npa=nnz.npa AND nbr.nxx=nnz.nxx AND nnz.state=nbr.rc_state 
INNER JOIN telephonenumber AS tn ON nbr.npa=tn.npa AND nbr.nxx=tn.nxx AND nbr.block=tn.block 
INNER JOIN ratecenter_tier_xref AS rtx ON nbr.rc_abbreviation=rtx.rc_abbreviation AND nbr.rc_state=rtx.rc_state AND tn.vendor_id=rtx.vendor_id AND rtx.rc_supports_new_tns=true 
WHERE (tn.tn_status='Available' AND tn.protected_account_id IS NULL) AND rtx.tier_id IN (SELECT tier_id from account_tier_xref WHERE account_id =:account_id ) LIMIT 100