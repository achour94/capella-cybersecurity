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
package org.polarsys.capella.cybersecurity.test.transition;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.capella.common.ef.command.ICommand;
import org.polarsys.capella.core.transition.system.topdown.commands.IntramodelTransitionCommand;
import org.polarsys.capella.core.transition.system.topdown.constants.ITopDownConstants;

public class CyberTransitionCommandHelper
    extends org.polarsys.capella.core.transition.system.topdown.commands.TransitionCommandHelper {

  public static CyberTransitionCommandHelper getInstance() {
    return new CyberTransitionCommandHelper();
  }

  public ICommand getCybersecurityTransitionCommand(Collection<?> elements, IProgressMonitor monitor) {
    return new IntramodelTransitionCommand(elements, monitor) {
      @Override
      protected String getTransitionKind() {
        return ITopDownConstants.TRANSITION_TOPDOWN;
      }
    };
  }
}
