// Copyright 2016 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.lib.skyframe;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * This event is fired at the beginning of the loading phase.
 */
public final class LoadingPhaseStartedEvent {

  final LoadingProgressReceiver loadingProgressReceiver;
  final AtomicInteger numPackagesLoaded;

  /**
   * Construct the event
   *
   * @param loadingProgressReceiver a receiver that gets updated about the progress of loading
   */
  public LoadingPhaseStartedEvent(
      LoadingProgressReceiver loadingProgressReceiver, AtomicInteger numPackagesLoaded) {
    this.loadingProgressReceiver = loadingProgressReceiver;
    this.numPackagesLoaded = numPackagesLoaded;
  }

  public LoadingProgressReceiver getLoadingProgressReceiver() {
    return loadingProgressReceiver;
  }

  public AtomicInteger getNumPackagesLoaded() {
    return numPackagesLoaded;
  }
}
