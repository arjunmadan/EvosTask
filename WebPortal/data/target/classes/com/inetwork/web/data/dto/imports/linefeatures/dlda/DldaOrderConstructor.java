package com.inetwork.web.data.dto.imports.linefeatures.dlda;

import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.inetwork.common.dto.dlda.DldaTnGroup;
import com.inetwork.common.dto.dlda.order.DldaOrderPayload;
import com.inetwork.common.dto.dlda.order.DldaOrderResponse;
import com.inetwork.common.dto.order.TelephoneNumberError;
import com.inetwork.common.exception.ValidationException;
import com.inetwork.common.messaging.HttpStatus;

import java.util.List;

public class DldaOrderConstructor
{
    private final DldaRowValidator dldaRowValidator = new DldaRowValidator();

    public DldaOrderPayloads getDldaOrderPayloads(Multimap<DldaDetailsKey, String> detailGroups) {
        return detailGroups != null && !detailGroups.isEmpty() ? createDldaOrderPayloads(detailGroups) : null;
    }

    private DldaOrderPayloads createDldaOrderPayloads(Multimap<DldaDetailsKey, String> detailGroups) {
        DldaOrderPayloads dldaOrderPayloads = new DldaOrderPayloads();

        List<DldaTnGroup> newDldaTnGroups = Lists.newArrayList();
        List<DldaTnGroup> removeDldaTnGroups = Lists.newArrayList();
        List<TelephoneNumberError> errorList = Lists.newArrayList();

        for (DldaDetailsKey dldaDetailsKey : detailGroups.keySet())
        {
            try {
                dldaRowValidator.validate(dldaDetailsKey);
                DldaTnGroup detailTnGroup = dldaDetailsKey.asDldaTnGroup();
                detailTnGroup.setGroupNumbers(Lists.newArrayList(detailGroups.get(dldaDetailsKey)));

                switch (DldaServiceType.valueOf(dldaDetailsKey.getServiceType().toUpperCase())) {
                    case NEW:
                        newDldaTnGroups.add(detailTnGroup);
                        break;
                    case REMOVE:
                        removeDldaTnGroups.add(detailTnGroup);
                        break;
                }
            } catch (ValidationException e) {
                createError(errorList, e.getErrorDescription(), Lists.newArrayList(detailGroups.get(dldaDetailsKey)));
            }
        }

        if (!newDldaTnGroups.isEmpty()) {
            DldaOrderPayload newDldPayload = new DldaOrderPayload();
            newDldPayload.setDeleteDldaTnGroups(String.valueOf(DldaServiceType.NEW.isDeleteDlda()));
            newDldPayload.setDldaTnGroups(newDldaTnGroups);
            dldaOrderPayloads.setNewDldaOrdersPayload(newDldPayload);
        }

        if (!removeDldaTnGroups.isEmpty()) {
            DldaOrderPayload removeDldPayload = new DldaOrderPayload();
            removeDldPayload.setDeleteDldaTnGroups(String.valueOf(DldaServiceType.REMOVE.isDeleteDlda()));
            removeDldPayload.setDldaTnGroups(removeDldaTnGroups);
            dldaOrderPayloads.setRemoveDldaOrdersPayload(removeDldPayload);
        }

        if (!errorList.isEmpty()) {
            dldaOrderPayloads.setFailedDldaOrdersResponse(createFailedOrderResponse(errorList));
        }

        return dldaOrderPayloads;
    }

    private void createError(List<TelephoneNumberError> errorList, String errorDescription, List<String> invalidNumbers) {
        TelephoneNumberError telephoneNumberError = new TelephoneNumberError();
        telephoneNumberError.setDescription(errorDescription);
        telephoneNumberError.setTelephoneNumber(invalidNumbers.get(0));
        telephoneNumberError.setCode(HttpStatus.BAD_REQUEST.getCode());

        errorList.add(telephoneNumberError);
    }

    private DldaOrderResponse createFailedOrderResponse(List<TelephoneNumberError> errorList) {
        DldaOrderResponse response = new DldaOrderResponse();
        DldaOrderPayload dldaOrderPayload = new DldaOrderPayload();

        List<DldaTnGroup> dldaTnGroups = Lists.newArrayList();
        dldaTnGroups.add(new DldaTnGroup());

        dldaOrderPayload.setErrors(errorList);
        dldaOrderPayload.setDldaTnGroups(dldaTnGroups);
        response.setPayload(dldaOrderPayload);

        return response;
    }
}
