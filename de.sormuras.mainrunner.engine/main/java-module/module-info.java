/*
 * Copyright (C) 2019 Christian Stein
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Provides {@code TestEngine} implementation that runs Java programs as tests.
 *
 * <p>This module doesn't export any package on purpose.
 */
module de.sormuras.mainrunner.engine {
  requires static de.sormuras.mainrunner.api;
  requires org.junit.platform.engine;

  provides org.junit.platform.engine.TestEngine with
      de.sormuras.mainrunner.engine.Mainrunner;
}