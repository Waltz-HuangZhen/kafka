/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.kafka.streams.kstream;

import org.apache.kafka.common.annotation.InterfaceStability;

/**
 * The {@code Initializer} interface for creating an initial value in aggregations.
 * {@code Initializer} is used in combination with {@link Aggregator}.
 *
 * @param <VA> aggregate value type
 * @see Aggregator
 * @see KGroupedStream#aggregate(Initializer, Aggregator, org.apache.kafka.common.serialization.Serde, String)
 * @see KGroupedStream#aggregate(Initializer, Aggregator, org.apache.kafka.streams.processor.StateStoreSupplier)
 * @see KGroupedStream#aggregate(Initializer, Aggregator, Windows, org.apache.kafka.common.serialization.Serde, String)
 * @see KGroupedStream#aggregate(Initializer, Aggregator, Windows, org.apache.kafka.streams.processor.StateStoreSupplier)
 * @see KGroupedStream#aggregate(Initializer, Aggregator, Merger, SessionWindows, org.apache.kafka.common.serialization.Serde, String)
 * @see KGroupedStream#aggregate(Initializer, Aggregator, Merger, SessionWindows, org.apache.kafka.common.serialization.Serde, org.apache.kafka.streams.processor.StateStoreSupplier)
 */
@InterfaceStability.Unstable
public interface Initializer<VA> {

    /**
     * Return the initial value for an aggregation.
     *
     * @return the initial value for an aggregation
     */
    VA apply();
}
