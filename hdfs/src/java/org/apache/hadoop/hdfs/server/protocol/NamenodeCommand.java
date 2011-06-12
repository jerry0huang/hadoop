/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableFactories;
import org.apache.hadoop.io.WritableFactory;

/**
 * Base class for name-node command.
 * Issued by the name-node to notify other name-nodes what should be done.
 */
public class NamenodeCommand extends ServerCommand {
  static {
    WritableFactories.setFactory(NamenodeCommand.class,
        new WritableFactory() {
          public Writable newInstance() {return new NamenodeCommand();}
        });
  }

  public NamenodeCommand() {
    super();
  }

  public NamenodeCommand(int action) {
    super(action);
  }
}
