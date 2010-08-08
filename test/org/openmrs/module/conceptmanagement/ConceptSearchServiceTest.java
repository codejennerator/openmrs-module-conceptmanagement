/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.conceptmanagement;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openmrs.ConceptClass;
import org.openmrs.api.context.Context;
import org.openmrs.test.BaseModuleContextSensitiveTest;

/**
 * TestCase to test the concept search service
 */
public class ConceptSearchServiceTest extends BaseModuleContextSensitiveTest {
	
	@Test
	public void testConceptQuery() {
		ConceptSearchService searchService = (ConceptSearchService) Context.getService(ConceptSearchService.class);
		Assert.assertNotNull("searchService should not be null", searchService);
		
		List<ConceptClass> classList = searchService.getAllConceptClasses();
		Assert.assertNotNull("some concept-classes should be found", classList);
	}
	
}