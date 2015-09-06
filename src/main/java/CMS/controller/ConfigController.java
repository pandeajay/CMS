package CMS.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import CMS.utilities.Utilities;

/**
 * Controller class
 * 
 * @author apande
 *
 */
@RestController
public class ConfigController {

	/**
	 * 
	 * @param app_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}", method = RequestMethod.GET)
	@ResponseBody
	public String getApplication(@PathVariable("app_id") String app_id) {
		return Utilities.getApplication(app_id);
	}

	/**
	 * 
	 * @param app_name
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_name}", method = RequestMethod.POST)
	@ResponseBody
	public String createAplication(@PathVariable("app_name") String app_name) {
		return Utilities.createApplication(app_name);
	}

	/**
	 * 
	 * @param app_id
	 * @param app_name
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}/{app_name}", method = RequestMethod.PUT)
	@ResponseBody
	public String deleteApplication(@PathVariable("app_id") String app_id, @PathVariable("app_name") String app_name) {
		return Utilities.updateApplication(app_id, app_name);
	}

	/**
	 * 
	 * @param app_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteApplication(@PathVariable("app_id") String app_id) {
		return Utilities.deleteApplication(app_id);
	}

	/**
	 * 
	 * @param env_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/environments/{env_id}", method = RequestMethod.GET)
	@ResponseBody
	public String getEnvironment(@PathVariable("env_id") String env_id) {
		return Utilities.getEnvironment(env_id);
	}

	/**
	 * 
	 * @param env_name
	 * @return
	 */
	@RequestMapping(value = "/api/v1/environments/{env_name}", method = RequestMethod.POST)
	@ResponseBody
	public String createEnvironment(@PathVariable("env_name") String env_name) {
		return Utilities.createEnvironment(env_name);
	}

	/**
	 * 
	 * @param env_id
	 * @param env_name
	 * @return
	 */
	@RequestMapping(value = "/api/v1/environments/{env_id}/{env_name}", method = RequestMethod.PUT)
	@ResponseBody
	public String updateEnvironemnt(@PathVariable("env_id") String env_id, @PathVariable("env_name") String env_name) {
		return Utilities.updateEnvironment(env_id, env_name);
	}

	/**
	 * 
	 * @param env_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/environments/{env_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteEnvironment(@PathVariable("env_id") String env_id) {
		return Utilities.deleteEnvironment(env_id);
	}

	/**
	 * 
	 * @param app_id
	 * @param env_id
	 * @param level_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}/environments/{env_id}/levels/{level_id}/configurations", method = RequestMethod.GET)
	@ResponseBody
	public String getAllConfigurations(@PathVariable("app_id") String app_id, @PathVariable("env_id") String env_id,
			@PathVariable("level_id") String level_id) {
		return Utilities.getConfig(app_id, env_id, level_id, "");
	}

	/**
	 * 
	 * @param app_id
	 * @param env_id
	 * @param level_id
	 * @param config_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}/environments/{env_id}/levels/{level_id}/configurations/{config_id}", method = RequestMethod.GET)
	@ResponseBody
	public String getSpecificConfguration(@PathVariable("app_id") String app_id, @PathVariable("env_id") String env_id,
			@PathVariable("level_id") String level_id, @PathVariable("config_id") String config_id) {
		return Utilities.getConfig(app_id, env_id, level_id, config_id);
	}

	/**
	 * 
	 * @param payload
	 * @param app_id
	 * @param env_id
	 * @param level_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}/environments/{env_id}/levels/{level_id}/configurations", method = RequestMethod.POST)
	@ResponseBody
	public String postConfiguration(@RequestBody String payload, @PathVariable("app_id") String app_id,
			@PathVariable("env_id") String env_id, @PathVariable("level_id") String level_id) {
		return Utilities.createConfig(payload, app_id, env_id, level_id);
	}

	/**
	 * 
	 * @param payload
	 * @param app_id
	 * @param env_id
	 * @param level_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}/environments/{env_id}/levels/{level_id}/configurations", method = RequestMethod.PUT)
	@ResponseBody
	public String putAllConfigs(@RequestBody String payload, @PathVariable("app_id") String app_id,
			@PathVariable("env_id") String env_id, @PathVariable("level_id") String level_id) {
		return Utilities.putConfig(payload, app_id, env_id, level_id, "");
	}

	/**
	 * 
	 * @param payload
	 * @param app_id
	 * @param env_id
	 * @param level_id
	 * @param config_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}/environments/{env_id}/levels/{level_id}/configurations/{config_id}", method = RequestMethod.PUT)
	@ResponseBody
	public String putSpecificConfig(@RequestBody String payload, @PathVariable("app_id") String app_id,
			@PathVariable("env_id") String env_id, @PathVariable("level_id") String level_id,
			@PathVariable("config_id") String config_id) {
		return Utilities.putConfig(payload, app_id, env_id, level_id, config_id);
	}

	/**
	 * 
	 * @param payload
	 * @param app_id
	 * @param env_id
	 * @param level_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}/environments/{env_id}/levels/{level_id}/configurations", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteAllConfig(@RequestBody(required = false) String payload, @PathVariable("app_id") String app_id,
			@PathVariable("env_id") String env_id, @PathVariable("level_id") String level_id) {
		return Utilities.deleteConfig(payload, app_id, env_id, level_id, "");
	}

	/**
	 * 
	 * @param app_id
	 * @param env_id
	 * @param level_id
	 * @param config_id
	 * @return
	 */
	@RequestMapping(value = "/api/v1/applications/{app_id}/environments/{env_id}/levels/{level_id}/configurations/{config_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteSpecificConfig(@PathVariable("app_id") String app_id, @PathVariable("env_id") String env_id,
			@PathVariable("level_id") String level_id, @PathVariable("config_id") String config_id) {
		return Utilities.deleteConfig("", app_id, env_id, level_id, config_id);
	}
}
