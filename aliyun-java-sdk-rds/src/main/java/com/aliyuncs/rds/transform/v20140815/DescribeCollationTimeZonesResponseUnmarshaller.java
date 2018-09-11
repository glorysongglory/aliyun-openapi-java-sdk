/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeCollationTimeZonesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeCollationTimeZonesResponse.CollationTimeZone;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCollationTimeZonesResponseUnmarshaller {

	public static DescribeCollationTimeZonesResponse unmarshall(DescribeCollationTimeZonesResponse describeCollationTimeZonesResponse, UnmarshallerContext context) {
		
		describeCollationTimeZonesResponse.setRequestId(context.stringValue("DescribeCollationTimeZonesResponse.RequestId"));

		List<CollationTimeZone> collationTimeZones = new ArrayList<CollationTimeZone>();
		for (int i = 0; i < context.lengthValue("DescribeCollationTimeZonesResponse.CollationTimeZones.Length"); i++) {
			CollationTimeZone collationTimeZone = new CollationTimeZone();
			collationTimeZone.setTimeZone(context.stringValue("DescribeCollationTimeZonesResponse.CollationTimeZones["+ i +"].TimeZone"));
			collationTimeZone.setStandardTimeOffset(context.stringValue("DescribeCollationTimeZonesResponse.CollationTimeZones["+ i +"].StandardTimeOffset"));
			collationTimeZone.setDescription(context.stringValue("DescribeCollationTimeZonesResponse.CollationTimeZones["+ i +"].Description"));

			collationTimeZones.add(collationTimeZone);
		}
		describeCollationTimeZonesResponse.setCollationTimeZones(collationTimeZones);
	 
	 	return describeCollationTimeZonesResponse;
	}
}