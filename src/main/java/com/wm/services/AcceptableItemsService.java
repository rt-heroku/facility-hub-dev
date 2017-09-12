/*
 * Created on 2017-09-12 ( Time 13:14:27 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */

package com.wm.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wm.entities.AcceptableItems;
import com.wm.exceptions.AcceptableItemsNotFoundException;
import com.wm.repository.AcceptableItemsRepository;

@Service
@Transactional(rollbackFor=AcceptableItemsNotFoundException.class)
public class AcceptableItemsService 
{
	private static Logger logger = LoggerFactory.getLogger(AcceptableItemsService.class);
	
	@Autowired
	private AcceptableItemsRepository acceptableitemsRepository;
		
	/*
	 * READ methods
	 */
	public Page<AcceptableItems> findAll(int page, int count) {
		
		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> findAll AcceptableItemss");
		
		return acceptableitemsRepository.findAll(new PageRequest(page, count));
	}

	public Iterable<AcceptableItems> findAll() {
		
		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> findAll AcceptableItemss");
		
		return acceptableitemsRepository.findAll();
	}
/*
	public AcceptableItems findBySfid(String acceptableitems){
		if (logger.isDebugEnabled())
			logger.debug("Retrieving AcceptableItems with sfid:" + acceptableitems);
		
		return acceptableitemsRepository.findBySfid(acceptableitems);
		
	}
*/
	public AcceptableItems get(int id) {
		if (logger.isDebugEnabled())
			logger.debug("Retrieving AcceptableItems with id:" + id);
		
		AcceptableItems elementToGet = acceptableitemsRepository.findOne(id);
		
		if (elementToGet == null)
			throw new AcceptableItemsNotFoundException(id);
		
		return elementToGet;
	}

	public AcceptableItems create(AcceptableItems acceptableitems) {

		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> create:" + acceptableitems);
			
		return acceptableitemsRepository.save(acceptableitems);
	}

	public AcceptableItems update(AcceptableItems acceptableitems) {
		
		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> create:" + acceptableitems);

		AcceptableItems elementToUpdate = acceptableitemsRepository.findOne(acceptableitems.getId());
		
		if (elementToUpdate == null)
			throw new AcceptableItemsNotFoundException(acceptableitems.getName());
		
		elementToUpdate.update(acceptableitems);
		acceptableitemsRepository.save(elementToUpdate);
		
		return elementToUpdate;
	}

	public AcceptableItems delete(int id) {
		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> delete:" + id);

		AcceptableItems elementToDelete = get(id);
		
		if (elementToDelete == null)
			throw new AcceptableItemsNotFoundException(id);
		
		acceptableitemsRepository.delete(elementToDelete);

		return elementToDelete;
	}

}
