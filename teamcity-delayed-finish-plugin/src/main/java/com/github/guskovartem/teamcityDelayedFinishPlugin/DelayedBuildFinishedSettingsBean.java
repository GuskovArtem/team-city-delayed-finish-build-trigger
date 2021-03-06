/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
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

/*
   Based on Example code provided on TeamCity Plugin Forums: http://devnet.jetbrains.com/message/5463043#5463043
*/

package com.github.guskovartem.teamcityDelayedFinishPlugin;

import java.util.ArrayList;
import java.util.List;
import jetbrains.buildServer.serverSide.ProjectManager;
import jetbrains.buildServer.serverSide.SBuildType;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
public class DelayedBuildFinishedSettingsBean {

  private final ProjectManager myProjectManager;

  @NotNull
  public List<SBuildType> getAvailableActiveBuildTypes() {
    return computeAvailableBuildTypes(myProjectManager.getActiveBuildTypes());
  }

  @NotNull
  public List<SBuildType> getAvailableArchivedBuildTypes() {
    return computeAvailableBuildTypes(myProjectManager.getArchivedBuildTypes());
  }

  private List<SBuildType> computeAvailableBuildTypes(List<SBuildType> allAvailable) {
    return new ArrayList<>(allAvailable);
  }
}
