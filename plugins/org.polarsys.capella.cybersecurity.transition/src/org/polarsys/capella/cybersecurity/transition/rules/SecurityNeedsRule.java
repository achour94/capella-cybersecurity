package org.polarsys.capella.cybersecurity.transition.rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.transition.common.rules.AbstractUpdateRule;
import org.polarsys.capella.cybersecurity.model.CybersecurityPackage;
import org.polarsys.capella.cybersecurity.model.SecurityNeeds;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

public class SecurityNeedsRule extends AbstractUpdateRule {

  public SecurityNeedsRule() {
    registerUpdatedReference(CybersecurityPackage.Literals.SECURITY_NEEDS__CONFIDENTIALITY_VALUE);
    registerUpdatedReference(CybersecurityPackage.Literals.SECURITY_NEEDS__INTEGRITY_VALUE);
    registerUpdatedReference(CybersecurityPackage.Literals.SECURITY_NEEDS__AVAILABILITY_VALUE);
    registerUpdatedReference(CybersecurityPackage.Literals.SECURITY_NEEDS__TRACEABILITY_VALUE);
  }

  @Override
  protected EClass getSourceType() {
    return CybersecurityPackage.Literals.SECURITY_NEEDS;
  }

  @Override
  public EClass getTargetType(EObject element, IContext context) {
    return CybersecurityPackage.Literals.SECURITY_NEEDS;
  }

  @Override
  protected void updateElement(EObject element, EObject result, IContext context) {
    super.updateElement(element, result, context);
    SecurityNeeds paResult = (SecurityNeeds) result;
    SecurityNeeds paSource = (SecurityNeeds) element;
    paResult.setAvailabilityValue(paSource.getAvailabilityValue());
    paResult.setConfidentialityValue(paSource.getConfidentialityValue());
    paResult.setIntegrityValue(paSource.getIntegrityValue());
    paResult.setTraceabilityValue(paSource.getTraceabilityValue());
  }
}
