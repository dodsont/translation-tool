/*******************************************************************************
 * Copyright 2016, Apalon Apps, LLC
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
 *******************************************************************************/
package com.apalon.translation.tool

/**
 * Created by abhi on 1/11/16.
 */
class ImportConfig {
    public boolean escapeAll;
    public String inputFile;
    public String outputDirPath;
    public String outputFileName;
    public String mappingFile;


    public ImportConfig() {}

    public ImportConfig(String inputFile, String outputDirName) {
        this.inputFile = inputFile;
        this.outputDirPath = outputDirName;
        this.escapeAll = true;
    }

    public void setMappingFile(String mappingFile) {
        this.mappingFile = mappingFile;
    }
}