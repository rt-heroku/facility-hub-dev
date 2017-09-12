/*
 * Created on 2017-09-12 ( Time 13:14:27 )
 * Generated by Telosys Tools Generator ( version 3.0.0 )
 */

package com.wm.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.wm.model.ResponseMessage;
import com.wm.entities.AcceptableItems;
import com.wm.services.AcceptableItemsService;

@Controller
@RequestMapping(value="/api/v1/acceptableitems")
public class AcceptableItemsRestController {
	
	private static Logger logger = LoggerFactory.getLogger(AcceptableItemsRestController.class);
	
	@Autowired
	private AcceptableItemsService acceptableitemsService;
		
	/*
	 * READ METHODS
	 */

	@RequestMapping(value="", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getAll() {

		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(acceptableitemsService.findAll());
		} catch (Exception e) {
			logger.error("AcceptableItemsController -> getAll", e);
			responseMessage.setError(-1, "Unable to get page for AcceptableItems: " + e.getMessage());
		}
		return responseMessage;
	}

	@RequestMapping(value="/page", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getPage(@RequestParam int page, @RequestParam int records) {

		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(acceptableitemsService.findAll(page, records));
		} catch (Exception e) {
			logger.error("AcceptableItemsController -> getPage", e);
			responseMessage.setError(-1, "Unable to get page for AcceptableItems: " + e.getMessage());
		}
		return responseMessage;
		
	}


//	@RequestMapping(value="/count", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getCount() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("AcceptableItemsService -> getAll");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(acceptableitemsService.count());
//		} catch (Exception e) {
//			logger.error("AcceptableItemsController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all AcceptableItems: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

//	@RequestMapping(value="/page", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getPage(@RequestParam int page,@RequestParam int size) {
//
//		if (logger.isDebugEnabled())
//			logger.debug("AcceptableItemsService -> getPage(" + page + "," + size + ")");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(acceptableitemsService.getPage(page, size));
//		} catch (Exception e) {
//			logger.error("AcceptableItemsController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all AcceptableItems: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}
	
//	@RequestMapping(value="/elements", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getDropDownElements() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("AcceptableItemsService -> getDropDownElements");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(acceptableitemsService.getDropDownValues());
//		} catch (Exception e) {
//			logger.error("AcceptableItemsController -> getDropDownElements", e);
//			responseMessage.setError(-1, "Unable to getDropDownElements for AcceptableItems: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public ResponseMessage getOne(@PathVariable Integer id) {
		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> getOne(" + id + ")");
		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(acceptableitemsService.get(id));
		} catch (Exception e) {
			logger.error("AcceptableItemsController -> create", e);
			responseMessage.setError(-1,
					"Unable to create AcceptableItems: " + id + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	
	/*
	 * DML Methods
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage create(@RequestBody AcceptableItems element) {

		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> create:" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(acceptableitemsService.create(element));
		} catch (Exception e) {
			logger.error("AcceptableItemsController -> create", e);
			responseMessage.setError(-1,
					"Unable to create AcceptableItems: " + element + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage edit(@PathVariable Integer id, @RequestBody AcceptableItems element) {
		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> edit(" + id + "):" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			element.setId(id);
			responseMessage.setData(acceptableitemsService.create(element));
		} catch (Exception e) {
			logger.error("AcceptableItemsController -> edit", e);
			responseMessage.setError(-1,
					"Unable to edit AcceptableItems: " + element + ",Error:" + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage delete(@PathVariable Integer id) {

		if (logger.isDebugEnabled())
			logger.debug("AcceptableItemsService -> delete(" + id + ")");

		ResponseMessage responseMessage = new ResponseMessage();
		try {
			acceptableitemsService.delete(id);
		} catch (Exception e) {
			logger.error("AcceptableItemsController -> delete", e);
			responseMessage.setError(-1, "Unable to delete AcceptableItems: " + id + ",Error:"  + e.getMessage());
		}
		return responseMessage;
	}
	
	@ExceptionHandler(Exception.class)
	public @ResponseBody
	String handleException(Exception e, HttpServletResponse response) {
	    response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	    return e.getMessage();
	}

}

