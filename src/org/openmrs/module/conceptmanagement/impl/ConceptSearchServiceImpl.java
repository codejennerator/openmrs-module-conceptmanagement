package org.openmrs.module.conceptmanagement.impl;
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



import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Concept;
import org.openmrs.module.conceptmanagement.ConceptSearch;
import org.openmrs.module.conceptmanagement.ConceptSearchDAO;
import org.openmrs.module.conceptmanagement.ConceptSearchService;

/**
 *
 */
public class ConceptSearchServiceImpl implements ConceptSearchService {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	private ConceptSearchDAO dao;
	
	public ConceptSearchServiceImpl() {
	}
	
	private ConceptSearchDAO getConceptSearchDAO() {
		return dao;
	}
	
	public void setConceptSearchDAO(ConceptSearchDAO dao) {
		this.dao = dao;
	}
	
	/**
	 * @see org.openmrs.module.conceptmanagement.impl.ConceptSearchService#getConcept(java.lang.Integer)
	 */
	@Override
	public Concept getConcept(Integer conceptId) {
		return dao.getConcept(conceptId);
	}
	
	/**
	 * @see org.openmrs.module.conceptmanagement.impl.ConceptSearchService#getConcepts(org.openmrs.module.conceptmanagement.ConceptSearch)
	 */
	@Override
	public List<Concept> getConcepts(ConceptSearch cs) {
		return dao.getConcepts(cs);
	}
	
	/**
	 * @see org.openmrs.module.conceptmanagement.impl.ConceptSearchService#getNumberOfObsForConcept(java.lang.Integer)
	 */
	@Override
	public Integer getNumberOfObsForConcept(Integer conceptId) {
		return dao.getNumberOfObsForConcept(conceptId);
	}
	
}
