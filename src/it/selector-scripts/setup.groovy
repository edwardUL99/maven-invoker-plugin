/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apache.commons.io.FileUtils

// Previous potential target 'content' has impact on IT execution
// (Some new file should be created by verify.sh) 
FileUtils.deleteQuietly( new File( basedir, "target/invoker-reports-test" ) );
FileUtils.deleteQuietly( new File( basedir, "src/it/script-ret-quiet/target" ) );
FileUtils.deleteQuietly( new File( basedir, "src/it/script-ret-true/target" ) );
return true;
