package com.inetwork.web.data.shared.dto;

import com.inetwork.web.data.shared.OrderType;

import java.util.List;

public interface FeatureOrder
{

   List<? extends TnError> getErrors();

   Integer getAccountId();

   OrderType getOrderType();

}
