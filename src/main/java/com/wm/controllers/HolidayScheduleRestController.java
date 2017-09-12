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
import com.wm.entities.HolidaySchedule;
import com.wm.services.HolidayScheduleService;

@Controller
@RequestMapping(value="/api/v1/holidayschedule")
public class HolidayScheduleRestController {
	
	private static Logger logger = LoggerFactory.getLogger(HolidayScheduleRestController.class);
	
	@Autowired
	private HolidayScheduleService holidayscheduleService;
		
	/*
	 * READ METHODS
	 */

	@RequestMapping(value="", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getAll() {

		if (logger.isDebugEnabled())
			logger.debug("HolidayScheduleService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(holidayscheduleService.findAll());
		} catch (Exception e) {
			logger.error("HolidayScheduleController -> getAll", e);
			responseMessage.setError(-1, "Unable to get page for HolidaySchedule: " + e.getMessage());
		}
		return responseMessage;
	}

	@RequestMapping(value="/page", method=RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage getPage(@RequestParam int page, @RequestParam int records) {

		if (logger.isDebugEnabled())
			logger.debug("HolidayScheduleService -> getPage");
		
		ResponseMessage responseMessage = new ResponseMessage();
		try {
			responseMessage.setData(holidayscheduleService.findAll(page, records));
		} catch (Exception e) {
			logger.error("HolidayScheduleController -> getPage", e);
			responseMessage.setError(-1, "Unable to get page for HolidaySchedule: " + e.getMessage());
		}
		return responseMessage;
		
	}


//	@RequestMapping(value="/count", method=RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
//	@ResponseBody
//	public ResponseMessage getCount() {
//
//		if (logger.isDebugEnabled())
//			logger.debug("HolidayScheduleService -> getAll");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(holidayscheduleService.count());
//		} catch (Exception e) {
//			logger.error("HolidayScheduleController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all HolidaySchedule: " + e.getMessage());
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
//			logger.debug("HolidayScheduleService -> getPage(" + page + "," + size + ")");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(holidayscheduleService.getPage(page, size));
//		} catch (Exception e) {
//			logger.error("HolidayScheduleController -> getAll", e);
//			responseMessage.setError(-1, "Unable to get all HolidaySchedule: " + e.getMessage());
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
//			logger.debug("HolidayScheduleService -> getDropDownElements");
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		try {
//			responseMessage.setData(holidayscheduleService.getDropDownValues());
//		} catch (Exception e) {
//			logger.error("HolidayScheduleController -> getDropDownElements", e);
//			responseMessage.setError(-1, "Unable to getDropDownElements for HolidaySchedule: " + e.getMessage());
//		}
//		return responseMessage;
//		
//	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public ResponseMessage getOne(@PathVariable Integer id) {
		if (logger.isDebugEnabled())
			logger.debug("HolidayScheduleService -> getOne(" + id + ")");
		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(holidayscheduleService.get(id));
		} catch (Exception e) {
			logger.error("HolidayScheduleController -> create", e);
			responseMessage.setError(-1,
					"Unable to create HolidaySchedule: " + id + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	
	/*
	 * DML Methods
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage create(@RequestBody HolidaySchedule element) {

		if (logger.isDebugEnabled())
			logger.debug("HolidayScheduleService -> create:" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			responseMessage.setData(holidayscheduleService.create(element));
		} catch (Exception e) {
			logger.error("HolidayScheduleController -> create", e);
			responseMessage.setError(-1,
					"Unable to create HolidaySchedule: " + element + ",Error:"  + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage edit(@PathVariable Integer id, @RequestBody HolidaySchedule element) {
		if (logger.isDebugEnabled())
			logger.debug("HolidayScheduleService -> edit(" + id + "):" + element);

		ResponseMessage responseMessage = new ResponseMessage();
		
		try {
			element.setId(id);
			responseMessage.setData(holidayscheduleService.create(element));
		} catch (Exception e) {
			logger.error("HolidayScheduleController -> edit", e);
			responseMessage.setError(-1,
					"Unable to edit HolidaySchedule: " + element + ",Error:" + e.getMessage());
		}
		
		return responseMessage;
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE, 
			produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseMessage delete(@PathVariable Integer id) {

		if (logger.isDebugEnabled())
			logger.debug("HolidayScheduleService -> delete(" + id + ")");

		ResponseMessage responseMessage = new ResponseMessage();
		try {
			holidayscheduleService.delete(id);
		} catch (Exception e) {
			logger.error("HolidayScheduleController -> delete", e);
			responseMessage.setError(-1, "Unable to delete HolidaySchedule: " + id + ",Error:"  + e.getMessage());
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

