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
package org.polarsys.capella.cybersecurity.business.queries;

import org.polarsys.capella.cybersecurity.model.CybersecurityPackage;
import org.polarsys.capella.cybersecurity.model.EnterprisePrimaryAsset;
import org.polarsys.capella.cybersecurity.model.PrimaryAsset;

public class EnterprisePrimaryAsset_PrimaryAssets extends BlockArchitecturePredicateQuery {

  public EnterprisePrimaryAsset_PrimaryAssets() {
    super(CybersecurityPackage.Literals.PRIMARY_ASSET__OWNED_MEMBERS,
        obj -> PrimaryAsset.class.isInstance(obj) && !(EnterprisePrimaryAsset.class.isInstance(obj)),
        CybersecurityPackage.Literals.ENTERPRISE_PRIMARY_ASSET);
  }

}