/*******************************************************************************
 * Copyright (c) 2021 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.cybersecurity.business.queries;


import org.eclipse.emf.ecore.EClass;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.cybersecurity.model.CybersecurityPackage;
import org.polarsys.capella.cybersecurity.model.InformationPrimaryAsset;

public class InformationPrimaryAsset_RealizedPrimaryAssets extends CybersecurityRealizedElements {

  public InformationPrimaryAsset_RealizedPrimaryAssets() {
    super(ModellingcorePackage.Literals.TRACEABLE_ELEMENT__OUTGOING_TRACES, InformationPrimaryAsset.class::isInstance,
        CybersecurityPackage.Literals.INFORMATION_PRIMARY_ASSET);
  }

  @Override
  public EClass getExtensionClass() {
    return CybersecurityPackage.Literals.INFORMATION_PRIMARY_ASSET;
  }

}
