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

package org.apache.hadoop.mapred.lib;


import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Partitioner;

/**
 * Partitioner effecting a total order by reading split points from
 * an externally generated source.
 * @deprecated Use 
 * {@link org.apache.hadoop.mapreduce.lib.partition.TotalOrderPartitioner}
 */
@Deprecated
public class TotalOrderPartitioner<K extends WritableComparable<?>,V>
    extends org.apache.hadoop.mapreduce.lib.partition.TotalOrderPartitioner<K, V>
    implements Partitioner<K,V> {

  public TotalOrderPartitioner() { }

  public void configure(JobConf job) {
    super.setConf(job);
  }

}
