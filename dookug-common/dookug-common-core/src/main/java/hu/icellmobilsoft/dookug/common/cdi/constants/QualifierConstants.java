/*-
 * #%L
 * DookuG
 * %%
 * Copyright (C) 2023 i-Cell Mobilsoft Zrt.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package hu.icellmobilsoft.dookug.common.cdi.constants;

/**
 * Constants values of qualifiers
 * 
 * @author laszlo.padar
 * @since 0.1.0
 */
public interface QualifierConstants {

    /**
     * Available methods of template storage
     */
    interface StorageMethodType {

        /**
         * store templates in database
         */
        String DATABASE = "DATABASE";
    }

    /**
     * Available implementations of template engine
     */
    interface TemplateCompilerType {

        /**
         * Handlebars template engine
         */
        String HANDLEBARS = "HANDLEBARS";
    }

    /**
     * Available implementations of document generation
     */
    interface DocumentGeneratorType {

        /**
         * PdfBox generator
         */
        String PDF_BOX = "PDF_BOX";

        /**
         * SAXON generator
         */
        String SAXON = "SAXON";
    }
}