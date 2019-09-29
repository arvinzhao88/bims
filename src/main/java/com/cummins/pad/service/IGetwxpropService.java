package com.cummins.pad.service;

import java.util.Map;

public interface IGetwxpropService {

  Map<String, String> getwxprop(String url);

  String create_timestamp();
}
