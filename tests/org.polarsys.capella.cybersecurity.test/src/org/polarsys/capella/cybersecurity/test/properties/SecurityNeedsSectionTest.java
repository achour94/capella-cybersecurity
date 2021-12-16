/*******************************************************************
* Copyright � 2021 Thales Global Services SAS
*
* Licensed under the Thales Inner Source Software License:
* Version 1.2, InnerOpen - Distribution Controlled
*
* You may not use this file except in compliance with the License.
* You may obtain a copy of the License at https://gitlab.thalesdigital.io/Tiss-Organization/tiss-licenses
* See the License for the specific language governing permissions and limitations under the License.
*******************************************************************/
package org.polarsys.capella.cybersecurity.test.properties;

import org.polarsys.capella.cybersecurity.ui.properties.sections.SecurityNeedsSection;

public class SecurityNeedsSectionTest extends AbstractCybersecuritySectionTest {
  @Override
  public void test() throws Exception {
    super.init();
    doTest(PA__EPA_2_ID, new SecurityNeedsSection(), 4);
    doTest(PA__FPA_3_ID, new SecurityNeedsSection(), 4);
    doTest(PA__IPA_4_ID, new SecurityNeedsSection(), 4);
    doTest(PA__THREAT_1_ID, new SecurityNeedsSection(), 4);
    doTest(PA__PHYSICAL_FUNCTION_3_ID, new SecurityNeedsSection(), 4);
    doTest(PA__EXCHANGE_ITEM_1_ID, new SecurityNeedsSection(), 4);
    doTestNotSelect(PA__CYBERSECURITY_PKG_ID, new SecurityNeedsSection());
  }
}