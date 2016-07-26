/*
Copyright 2011 m6d.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.m6d.dualinputformat;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.mapred.InputSplit;

public class DualInputSplit implements InputSplit {

  @Override
  public long getLength() throws IOException {
    return 1;
  }

  @Override
  public String[] getLocations() throws IOException {
    return new String [] { "localhost" };
  }

  @Override
  public void write(DataOutput d) throws IOException {
  }

  @Override
  public void readFields(DataInput di) throws IOException {
  }

}