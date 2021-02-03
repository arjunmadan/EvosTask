package com.inetwork.web.data.shared.dto;

import java.util.List;

public interface TnError extends Error
{
   List<String> getTelephoneNumbers();
}
