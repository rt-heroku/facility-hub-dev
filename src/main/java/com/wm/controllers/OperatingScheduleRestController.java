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
import com.wm.entities.OperatingSchedule;
import com.wm.services.OperatingScheduleService;

@Controller
@RequestMapping(value="/api/v1/operatingschedule")
public class OperatingScheduleRestController {
	
	private static Logger logger = LoggerFactory.getLogger(OperatingScheduleRestController.class);
	
	@Autowired
	private OperatingScheduleService operatingscheduleService;
		
	/*
	 * READ METHODS
	 */

	@RequestMapping(value="", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getAll() {

		if (logger.isDebugEnabled())
			logger.debug("OperatingScheduleService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(operatingscheduleService.findAll());
		} catch (Exception e) {
			logger.error("OperatingScheduleController -> getAll", e);
			responseMessage.setError(-1, "Unable to get page for OperatingSchedule: " + e.getMessage());
		}
		return responseMessage;
	}

	@RequestMapping(value="/page", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getPage(@RequestParam int page, @RequestParam int records) {

		if (logger.isDebugEnabled())
			logger.debug("OperatingScheduleService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(operatingscheduleService.findAll(page, records));
		} catch (Exception e) {
			logger.error("OperatingScheduleController -> getPage", e);
			responseMessage.setError(-1, "Unable to get page for OperatingSchedule: " + e.getMessage());
		}
		return responseMessage;
		
	}


//	@RequestMapping(value="/count", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getCount() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("OperatingScheduleService -> getAll");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(operatingscheduleService.count());
//		} catch (Exception e) {
//			logger.error("OperatingScheduleController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all OperatingSchedule: " + e.getMessage());
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
//			logger.debug("OperatingScheduleService -> getPage(" + page + "," + size + ")");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(operatingscheduleService.getPage(page, size));
//		} catch (Exception e) {
//			logger.error("OperatingScheduleController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all OperatingSchedule: " + e.getMessage());
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
//			logger.debug("OperatingScheduleService -> getDropDownElements");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(operatingscheduleService.getDropDownValues());
//		} catch (Exception e) {
//			logger.error("OperatingScheduleController -> getDropDownElements", e);
//			responseMessage.setError(-1, "Unable to getDropDownElements for OperatingSchedule: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public ResponseMessage getOne(@PathVariable Integer id) {
		if (logger.isDebugEnabled())
			logger.debug("OperatingScheduleService -> getOne(" + id + ")");
		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(operatingscheduleService.get(id));
		} catch (Exception e) {
			logger.error("OperatingScheduleController -> create", e);
			responseMessage.setError(-1,
					"Unable to create OperatingSchedule: " + id + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	
	/*
	 * DML Methods
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage create(@RequestBody OperatingSchedule element) {

		if (logger.isDebugEnabled())
			logger.debug("OperatingScheduleService -> create:" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(operatingscheduleService.create(element));
		} catch (Exception e) {
			logger.error("OperatingScheduleController -> create", e);
			responseMessage.setError(-1,
					"Unable to create OperatingSchedule: " + element + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage edit(@PathVariable Integer id, @RequestBody OperatingSchedule element) {
		if (logger.isDebugEnabled())
			logger.debug("OperatingScheduleService -> edit(" + id + "):" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			element.setId(id);
			responseMessage.setData(operatingscheduleService.create(element));
		} catch (Exception e) {
			logger.error("OperatingScheduleController -> edit", e);
			responseMessage.setError(-1,
					"Unable to edit OperatingSchedule: " + element + ",Error:" + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage delete(@PathVariable Integer id) {

		if (logger.isDebugEnabled())
			logger.debug("OperatingScheduleService -> delete(" + id + ")");

		ResponseMessage responseMessage = new ResponseMessage();
		try {
			operatingscheduleService.delete(id);
		} catch (Exception e) {
			logger.error("OperatingScheduleController -> delete", e);
			responseMessage.setError(-1, "Unable to delete OperatingSchedule: " + id + ",Error:"  + e.getMessage());
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
