package com.github.hoangsvn.compoments.payload.response;

import com.github.hoangsvn.compoments.uilts.AppUitls;

public class MyResponse extends AppUitls {

    // Controller-related errors
    public final static Response_Message controller_exception = new Response_Message("A service exception occurred, please try again!", "Exception");
    public final static Response_Message controller_fail = new Response_Message("REST Controller Fail!", "Controller");
    public final static Response_Message controller_success = new Response_Message("REST Controller Success!", "Controller");
    public final static Response_Message controller_error = new Response_Message("REST Controller Error!", "Controller");
    public final static Response_Message please_login = new Response_Message("The invoice creation service encountered an error, please try again!", "Controller");
    public final static Response_Message not_found_data = new Response_Message("That was not found in the database, please try again!", "Controller");
    public final static Response_Message delete_success = new Response_Message("Deleted successfully!", "Controller");
    public final static Response_Message delete_error = new Response_Message("Delete error!", "Controller");
    public final static Response_Message insufficient_permission = new Response_Message("Insufficient permission for this operation!", "Controller");
    public final static Response_Message data_validation_error = new Response_Message("Validation error: Please check your input data!", "Controller");
    public final static Response_Message unauthorized_access = new Response_Message("Unauthorized access: You do not have permission to perform this action!", "Controller");
    public final static Response_Message invalid_credentials = new Response_Message("Invalid credentials: Please provide valid username and password!", "Controller");
    public final static Response_Message resource_not_found = new Response_Message("Resource not found: The requested resource does not exist!", "Controller");
    public final static Response_Message invalid_input_format = new Response_Message("Invalid input format: Please provide data in the correct format!", "Controller");
    public final static Response_Message method_not_allowed = new Response_Message("Method not allowed: The requested HTTP method is not supported for this endpoint!", "Controller");
    public final static Response_Message invalid_token = new Response_Message("Invalid token: Please provide a valid authentication token!", "Controller");
    public final static Response_Message quota_exceeded = new Response_Message("Quota exceeded: You have exceeded the usage limit for this service!", "Controller");
    public final static Response_Message resource_conflict = new Response_Message("Resource conflict: The requested action conflicts with the current state of the resource!", "Controller");
    public final static Response_Message file_too_large = new Response_Message("File too large: The uploaded file exceeds the size limit!", "Controller");
    public final static Response_Message permission_denied = new Response_Message("Permission denied: You do not have permission to perform this action!", "Controller");
    public final static Response_Message invalid_request = new Response_Message("Invalid request: The request is invalid or malformed, please check your input!", "Controller");
    public final static Response_Message validation_failed = new Response_Message("Validation failed: The input data failed validation, please review and try again!", "Controller");
    public final static Response_Message duplicate_entry = new Response_Message("Duplicate entry: The data you are trying to add already exists!", "Controller");
    public final static Response_Message not_supported = new Response_Message("Operation not supported: The requested operation is not supported!", "Controller");
    public final static Response_Message outdated_request = new Response_Message("Outdated request: Your request is outdated, please refresh and try again!", "Controller");
    public final static Response_Message forbidden_access = new Response_Message("Forbidden access: You do not have permission to access this resource!", "Controller");
    public final static Response_Message resource_locked = new Response_Message("Resource locked: The resource you are trying to access is currently locked!", "Controller");
    public final static Response_Message data_not_modified = new Response_Message("Data not modified: The requested data has not been modified since your last request!", "Controller");
    public final static Response_Message request_too_large = new Response_Message("Request too large: The size of the request exceeds the server's capacity limit!", "Controller");
    public final static Response_Message unavailable_endpoint = new Response_Message("Unavailable endpoint: The requested endpoint is not available!", "Controller");
    public final static Response_Message invalid_request_method = new Response_Message("Invalid request method: The HTTP request method is not supported for this endpoint!", "Controller");
    public final static Response_Message access_denied = new Response_Message("Access denied: You do not have permission to access this resource!", "Controller");
    public final static Response_Message resource_in_use = new Response_Message("Resource in use: The requested resource is currently in use and cannot be accessed!", "Controller");
    public final static Response_Message request_canceled = new Response_Message("Request canceled: Your request has been canceled!", "Controller");

    // Exception-related errors
    public final static Response_Message controller_unable_token = new Response_Message("Unable to authenticate user via token, please try again", "Exception");
    public final static Response_Message controller_upload_exception = new Response_Message("An exception occurred while the upload failed, please try again", "Exception");
    public final static Response_Message unknown_error = new Response_Message("Unknown error: An unknown error occurred, please contact support!", "Server");
    public final static Response_Message network_error = new Response_Message("Network error: There was an error in the network connection!", "Server");
    public final static Response_Message service_down = new Response_Message("Service down: The service is currently down for maintenance!", "Server");
    public final static Response_Message database_error = new Response_Message("Database error: An error occurred while accessing the database!", "Database");
    public final static Response_Message internal_server_error = new Response_Message("Internal server error: An unexpected error occurred on the server!", "Server");
    public final static Response_Message configuration_error = new Response_Message("Configuration error: There was an error in the service configuration!", "Server");

    // Notification-related errors
    public final static Response_Message expired_session = new Response_Message("Expired session: Your session has expired, please log in again!", "Controller");
    public final static Response_Message resource_deleted = new Response_Message("Resource deleted: The requested resource has been deleted!", "Controller");
    public final static Response_Message maintenance_mode = new Response_Message("Maintenance mode: The service is currently undergoing maintenance, please try again later!", "Server");

    // Payment-related errors
    public final static Response_Message payment_failed = new Response_Message("Payment failed: The payment transaction could not be completed!", "Controller");

    // User-related errors
    public final static Response_Message user_not_found = new Response_Message("User not found: The requested user does not exist!", "Controller");
    public final static Response_Message account_blocked = new Response_Message("Account blocked: Your account has been blocked, please contact support!", "Controller");

    // Resource-related errors
    public final static Response_Message resource_unauthorized = new Response_Message("Resource unauthorized: You are not authorized to access the requested resource!", "Controller");
    public final static Response_Message invalid_resource_id = new Response_Message("Invalid resource ID: The provided resource ID is not valid!", "Controller");

    // Request-related errors
    public final static Response_Message invalid_credentials_format = new Response_Message("Invalid credentials format: The provided credentials are not in the correct format!", "Controller");
    public final static Response_Message invalid_parameter = new Response_Message("Invalid parameter: One or more parameters in the request are invalid!", "Controller");
    public final static Response_Message invalid_file_format = new Response_Message("Invalid file format: The uploaded file is in an unsupported format!", "Controller");
    public final static Response_Message invalid_operation_state = new Response_Message("Invalid operation state: The service is in an invalid state!", "Controller");


}
