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
package org.polarsys.capella.cybersecurity.test.diagram;

import org.eclipse.emf.transaction.RollbackException;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt.Type;
import org.polarsys.capella.core.sirius.analysis.IDiagramNameConstants;
import org.polarsys.capella.cybersecurity.model.PrimaryAsset;
import org.polarsys.capella.cybersecurity.model.Threat;

public class CyberSABDiagramTest extends CyberXABDiagramTest {

  @Override
  protected String getSystemId() {
    return SA__SYSTEM;
  }

  @Override
  protected String getDataPkgId() {
    return SA__DATA;
  }

  @Override
  protected String getInterfacePkgId() {
    return SA__INTERFACES;
  }

  @Override
  protected Type getType() {
    return Type.SA;
  }

  @Override
  protected String getRepresentationName() {
    return IDiagramNameConstants.SYSTEM_ARCHITECTURE_BLANK_DIAGRAM_NAME;
  }

  @Override
  protected CyberXABDiagram createDiagram() {
    return CyberXABDiagram.createDiagram(context, getSystemId(), getType(), getRepresentationName());
  }

  @Override
  protected void createDiagramElements() {
    CyberXABDiagram diagram = (CyberXABDiagram) this.diagram;

    diagramElements.put("component1", diagram.createActor("component1", diagram.getDiagramId()));
    diagramElements.put("component2", diagram.createActor("component2", diagram.getDiagramId()));
    diagramElements.put("component3", diagram.createActor("component3", diagram.getDiagramId()));
    diagramElements.put("component4", diagram.createActor("component4", diagramElements.get("component3")));
    diagramElements.put("component5", diagram.createActor("component5", diagramElements.get("component4")));
    diagramElements.put("component6", diagram.createActor("component6", diagramElements.get("component5")));
    diagramElements.put("actor4", diagram.createActor("actor4", diagramElements.get("component3")));
    diagramElements.put("actor5", diagram.createActor("actor5", diagramElements.get("actor4")));
    diagramElements.put("component7", diagram.createActor("component7", diagramElements.get("actor5")));
    diagramElements.put("component8", diagram.createActor("component8", diagramElements.get("component7")));
  }

  @Override
  protected void insertPrimaryAsset(PrimaryAsset pa) {
    ((CyberXABDiagram) diagram).insertPrimaryAsset(pa);
  }

  @Override
  protected void removePrimaryAsset(PrimaryAsset pa) {
    ((CyberXABDiagram) diagram).removePrimaryAsset(pa);
  }

  @Override
  protected void insertThreat(Threat threat) {
    ((CyberXABDiagram) diagram).insertThreat(threat);
  }
  
  @Override
  protected void removeThreat(Threat threat) {
    ((CyberXABDiagram) diagram).removeThreat(threat);
  }

  @Override
  protected void step6() throws RollbackException, InterruptedException {
    super.step6();
    // check that third component has normal border size and black color
    checkComponentLooksNormal("component4");
  }

  @Override
  protected void step7() throws RollbackException, InterruptedException {
    super.step7();
    // check that third component has normal border size and black color
    checkComponentLooksNormal("component4");
  }

  @Override
  protected void step8() {
    super.step8();
    // check that third component has normal border size and black color
    checkComponentLooksNormal("component4");
  }

  @Override
  protected void step9() throws RollbackException, InterruptedException {
    super.step9();
    // check that first actor has the same border color as the threat color
    checkComponentLooksNormal("actor5");
  }

}
