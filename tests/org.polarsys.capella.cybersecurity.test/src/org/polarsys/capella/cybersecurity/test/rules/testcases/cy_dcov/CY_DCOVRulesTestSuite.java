/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *   
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.cybersecurity.test.rules.testcases.cy_dcov;

import org.polarsys.capella.cybersecurity.test.common.BasicDynamicModelTest;

import junit.framework.Test;
import junit.framework.TestSuite;
/**
 * 
 * Test on CY_DCOV Rules
 *
 */
public class CY_DCOVRulesTestSuite extends TestSuite {

    public CY_DCOVRulesTestSuite() {
      super("CY_DCOVRulesTestSuite"); //$NON-NLS-1$
      addTest(new Rule_CY_DCOV_01(BasicDynamicModelTest.OA));
      addTest(new Rule_CY_DCOV_01(BasicDynamicModelTest.SA));
      addTest(new Rule_CY_DCOV_01(BasicDynamicModelTest.LA));
      addTest(new Rule_CY_DCOV_01(BasicDynamicModelTest.PA));
      
      addTest(new Rule_CY_DCOV_02(BasicDynamicModelTest.OA));
      addTest(new Rule_CY_DCOV_02(BasicDynamicModelTest.SA));
      addTest(new Rule_CY_DCOV_02(BasicDynamicModelTest.LA));
      addTest(new Rule_CY_DCOV_02(BasicDynamicModelTest.PA));
      
      addTest(new Rule_CY_DCOV_03(BasicDynamicModelTest.OA));
      addTest(new Rule_CY_DCOV_03(BasicDynamicModelTest.SA));
      addTest(new Rule_CY_DCOV_03(BasicDynamicModelTest.LA));
      addTest(new Rule_CY_DCOV_03(BasicDynamicModelTest.PA));
      
      addTest(new Rule_CY_DCOV_04(BasicDynamicModelTest.OA));
      addTest(new Rule_CY_DCOV_04(BasicDynamicModelTest.SA));
      addTest(new Rule_CY_DCOV_04(BasicDynamicModelTest.LA));
      addTest(new Rule_CY_DCOV_04(BasicDynamicModelTest.PA));
      
      addTest(new Rule_CY_DCOV_05(BasicDynamicModelTest.OA));
      addTest(new Rule_CY_DCOV_05(BasicDynamicModelTest.SA));
      addTest(new Rule_CY_DCOV_05(BasicDynamicModelTest.LA));
      addTest(new Rule_CY_DCOV_05(BasicDynamicModelTest.PA));
      
    }

    public static Test suite() {
      return new CY_DCOVRulesTestSuite();
    }
  
}
