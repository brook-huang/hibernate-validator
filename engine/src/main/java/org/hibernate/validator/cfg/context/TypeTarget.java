/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hibernate.validator.cfg.context;

/**
 * Facet of a constraint mapping creational context which allows to the select the bean
 * type to which the next operations shall apply.
 *
 * @author Kevin Pollet <kevin.pollet@serli.com> (C) 2011 SERLI
 * @author Gunnar Morling
 */
public interface TypeTarget {
	/**
	 * Selects the type to which the next operations shall apply.
	 *
	 * @param <C> The type to select.
	 * @param type The type to select.
	 *
	 * @return A creational context representing the selected type.
	 */
	<C> TypeConstraintMappingContext<C> type(Class<C> type);
}
