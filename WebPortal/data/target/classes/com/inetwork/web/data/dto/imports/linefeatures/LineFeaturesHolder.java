package com.inetwork.web.data.dto.imports.linefeatures;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.inetwork.web.data.dto.imports.linefeatures.dlda.DldaDetailsKey;
import com.inetwork.web.data.dto.imports.linefeatures.e911.E911RowDetails;
import com.inetwork.web.data.dto.imports.linefeatures.lidb.LidbDetailsKey;
import com.inetwork.web.data.dto.imports.linefeatures.tnoption.TnOptionDetailsKey;

public class LineFeaturesHolder
{
   private final Multimap<LidbDetailsKey, String> lidbDetailGroups;
   private final Multimap<DldaDetailsKey, String> dldaDetailGroups;
   private final Multimap<TnOptionDetailsKey, String> tnOptionDetailGroups;
   private final Multimap<E911RowDetails, String> e911RowDetailsMappedToTn;

   public LineFeaturesHolder()
   {
      lidbDetailGroups = HashMultimap.create();
      dldaDetailGroups = HashMultimap.create();
      tnOptionDetailGroups = HashMultimap.create();
      e911RowDetailsMappedToTn = HashMultimap.create();
   }

   public boolean addLidbDetails(LidbDetailsKey lidbDetailsKey, String fullNumber)
   {
      return lidbDetailsKey != null && lidbDetailGroups.put(lidbDetailsKey, fullNumber);
   }

   public boolean addDldaDetails(DldaDetailsKey dldaDetailsKey, String fullNumber)
   {
      return dldaDetailsKey != null && dldaDetailGroups.put(dldaDetailsKey, fullNumber);
   }

   public boolean addTnOptionDetails(TnOptionDetailsKey tnOptionDetailsKey, String fullNumber)
   {
      return tnOptionDetailsKey != null && tnOptionDetailGroups.put(tnOptionDetailsKey, fullNumber);
   }

   public boolean addE911Details(E911RowDetails e911RowDetails, String fullNumber)
   {
      return e911RowDetails != null && e911RowDetailsMappedToTn.put(e911RowDetails, fullNumber);
   }

   public Multimap<LidbDetailsKey, String> getLidbDetailGroups()
   {
      return lidbDetailGroups;
   }

   public Multimap<DldaDetailsKey, String> getDldaDetailGroups()
   {
      return dldaDetailGroups;
   }

   public Multimap<TnOptionDetailsKey, String> getTnOptionDetailGroups()
   {
      return tnOptionDetailGroups;
   }

   public Multimap<E911RowDetails, String> getE911RowDetailsMappedToTn()
   {
      return e911RowDetailsMappedToTn;
   }
}
