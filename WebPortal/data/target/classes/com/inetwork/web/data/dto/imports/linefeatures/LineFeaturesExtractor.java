package com.inetwork.web.data.dto.imports.linefeatures;

import com.inetwork.web.data.dto.imports.linefeatures.cnam.TnOptionDetailsProvider;
import com.inetwork.web.data.dto.imports.linefeatures.dlda.DldaDetailsKey;
import com.inetwork.web.data.dto.imports.linefeatures.dlda.DldaDetailsProvider;
import com.inetwork.web.data.dto.imports.linefeatures.e911.E911RowDetails;
import com.inetwork.web.data.dto.imports.linefeatures.e911.E911RowDetailsProvider;
import com.inetwork.web.data.dto.imports.linefeatures.lidb.LidbDetailsKey;
import com.inetwork.web.data.dto.imports.linefeatures.lidb.LidbDetailsProvider;
import com.inetwork.web.data.dto.imports.linefeatures.tnoption.TnOptionDetailsKey;

public class LineFeaturesExtractor
{
   private final TnOptionDetailsProvider tnOptionDetailsProvider = new TnOptionDetailsProvider();
   private final LidbDetailsProvider lidbDetailsProvider = new LidbDetailsProvider();
   private final DldaDetailsProvider dldaDetailsProvider = new DldaDetailsProvider();
   private final E911RowDetailsProvider e911RowDetailsProvider = new E911RowDetailsProvider();

   public void extract(LineFeaturesRow lineFeaturesRow, LineFeaturesHolder lineFeaturesHolder)
   {
      String fullNumber = lineFeaturesRow.getNumber();
      lineFeaturesHolder.addTnOptionDetails(getValidTnOptionDetails(lineFeaturesRow), fullNumber);
      lineFeaturesHolder.addLidbDetails(getValidLidbDetails(lineFeaturesRow), fullNumber);
      lineFeaturesHolder.addDldaDetails(getValidDldaDetails(lineFeaturesRow), fullNumber);
      lineFeaturesHolder.addE911Details(getValidE911Details(lineFeaturesRow), fullNumber);
   }

   private LidbDetailsKey getValidLidbDetails(LineFeaturesRow lineFeaturesRow)
   {
      return lidbDetailsProvider.provideDetails(lineFeaturesRow);
   }

   private TnOptionDetailsKey getValidTnOptionDetails(LineFeaturesRow lineFeaturesRow)
   {
      return tnOptionDetailsProvider.provideDetails(lineFeaturesRow);
   }

   public DldaDetailsKey getValidDldaDetails(LineFeaturesRow lineFeaturesRow)
   {
      return dldaDetailsProvider.provideDetails(lineFeaturesRow);
   }

   private E911RowDetails getValidE911Details(LineFeaturesRow lineFeaturesRow)
   {
      return e911RowDetailsProvider.provide(lineFeaturesRow);
   }
}
