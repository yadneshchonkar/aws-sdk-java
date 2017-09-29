/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.pinpoint.model.*;

/**
 * Interface for accessing Amazon Pinpoint.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.pinpoint.AbstractAmazonPinpoint} instead.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonPinpoint {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "pinpoint";

    /**
     * Overrides the default endpoint for this client ("https://pinpoint.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "pinpoint.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://pinpoint.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "pinpoint.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://pinpoint.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonPinpoint#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * Creates or updates an app.
     * 
     * @param createAppRequest
     * @return Result of the CreateApp operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.CreateApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateApp" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAppResult createApp(CreateAppRequest createAppRequest);

    /**
     * Creates or updates a campaign.
     * 
     * @param createCampaignRequest
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    CreateCampaignResult createCampaign(CreateCampaignRequest createCampaignRequest);

    /**
     * Creates or updates an import job.
     * 
     * @param createImportJobRequest
     * @return Result of the CreateImportJob operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.CreateImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    CreateImportJobResult createImportJob(CreateImportJobRequest createImportJobRequest);

    /**
     * Used to create or update a segment.
     * 
     * @param createSegmentRequest
     * @return Result of the CreateSegment operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.CreateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CreateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSegmentResult createSegment(CreateSegmentRequest createSegmentRequest);

    /**
     * Delete an ADM channel
     * 
     * @param deleteAdmChannelRequest
     * @return Result of the DeleteAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAdmChannelResult deleteAdmChannel(DeleteAdmChannelRequest deleteAdmChannelRequest);

    /**
     * Deletes the APNs channel for an app.
     * 
     * @param deleteApnsChannelRequest
     * @return Result of the DeleteApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteApnsChannelResult deleteApnsChannel(DeleteApnsChannelRequest deleteApnsChannelRequest);

    /**
     * Delete an APNS sandbox channel
     * 
     * @param deleteApnsSandboxChannelRequest
     * @return Result of the DeleteApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApnsSandboxChannelResult deleteApnsSandboxChannel(DeleteApnsSandboxChannelRequest deleteApnsSandboxChannelRequest);

    /**
     * Deletes an app.
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * Delete a BAIDU GCM channel
     * 
     * @param deleteBaiduChannelRequest
     * @return Result of the DeleteBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBaiduChannelResult deleteBaiduChannel(DeleteBaiduChannelRequest deleteBaiduChannelRequest);

    /**
     * Deletes a campaign.
     * 
     * @param deleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteCampaignResult deleteCampaign(DeleteCampaignRequest deleteCampaignRequest);

    /**
     * Delete an email channel
     * 
     * @param deleteEmailChannelRequest
     * @return Result of the DeleteEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteEmailChannelResult deleteEmailChannel(DeleteEmailChannelRequest deleteEmailChannelRequest);

    /**
     * Deletes the event stream for an app.
     * 
     * @param deleteEventStreamRequest
     *        DeleteEventStream Request
     * @return Result of the DeleteEventStream operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteEventStreamResult deleteEventStream(DeleteEventStreamRequest deleteEventStreamRequest);

    /**
     * Deletes the GCM channel for an app.
     * 
     * @param deleteGcmChannelRequest
     * @return Result of the DeleteGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGcmChannelResult deleteGcmChannel(DeleteGcmChannelRequest deleteGcmChannelRequest);

    /**
     * Deletes a segment.
     * 
     * @param deleteSegmentRequest
     * @return Result of the DeleteSegment operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSegment" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSegmentResult deleteSegment(DeleteSegmentRequest deleteSegmentRequest);

    /**
     * Delete an SMS channel
     * 
     * @param deleteSmsChannelRequest
     * @return Result of the DeleteSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.DeleteSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/DeleteSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteSmsChannelResult deleteSmsChannel(DeleteSmsChannelRequest deleteSmsChannelRequest);

    /**
     * Get an ADM channel
     * 
     * @param getAdmChannelRequest
     * @return Result of the GetAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetAdmChannelResult getAdmChannel(GetAdmChannelRequest getAdmChannelRequest);

    /**
     * Returns information about the APNs channel for an app.
     * 
     * @param getApnsChannelRequest
     * @return Result of the GetApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetApnsChannelResult getApnsChannel(GetApnsChannelRequest getApnsChannelRequest);

    /**
     * Get an APNS sandbox channel
     * 
     * @param getApnsSandboxChannelRequest
     * @return Result of the GetApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApnsSandboxChannel" target="_top">AWS
     *      API Documentation</a>
     */
    GetApnsSandboxChannelResult getApnsSandboxChannel(GetApnsSandboxChannelRequest getApnsSandboxChannelRequest);

    /**
     * Returns information about an app.
     * 
     * @param getAppRequest
     * @return Result of the GetApp operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApp" target="_top">AWS API
     *      Documentation</a>
     */
    GetAppResult getApp(GetAppRequest getAppRequest);

    /**
     * Used to request the settings for an app.
     * 
     * @param getApplicationSettingsRequest
     * @return Result of the GetApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetApplicationSettingsResult getApplicationSettings(GetApplicationSettingsRequest getApplicationSettingsRequest);

    /**
     * Returns information about your apps.
     * 
     * @param getAppsRequest
     * @return Result of the GetApps operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApps" target="_top">AWS API
     *      Documentation</a>
     */
    GetAppsResult getApps(GetAppsRequest getAppsRequest);

    /**
     * Get a BAIDU GCM channel
     * 
     * @param getBaiduChannelRequest
     * @return Result of the GetBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetBaiduChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetBaiduChannelResult getBaiduChannel(GetBaiduChannelRequest getBaiduChannelRequest);

    /**
     * Returns information about a campaign.
     * 
     * @param getCampaignRequest
     * @return Result of the GetCampaign operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    GetCampaignResult getCampaign(GetCampaignRequest getCampaignRequest);

    /**
     * Returns information about the activity performed by a campaign.
     * 
     * @param getCampaignActivitiesRequest
     * @return Result of the GetCampaignActivities operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaignActivities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignActivities" target="_top">AWS
     *      API Documentation</a>
     */
    GetCampaignActivitiesResult getCampaignActivities(GetCampaignActivitiesRequest getCampaignActivitiesRequest);

    /**
     * Returns information about a specific version of a campaign.
     * 
     * @param getCampaignVersionRequest
     * @return Result of the GetCampaignVersion operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaignVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersion" target="_top">AWS
     *      API Documentation</a>
     */
    GetCampaignVersionResult getCampaignVersion(GetCampaignVersionRequest getCampaignVersionRequest);

    /**
     * Returns information about your campaign versions.
     * 
     * @param getCampaignVersionsRequest
     * @return Result of the GetCampaignVersions operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaignVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaignVersions" target="_top">AWS
     *      API Documentation</a>
     */
    GetCampaignVersionsResult getCampaignVersions(GetCampaignVersionsRequest getCampaignVersionsRequest);

    /**
     * Returns information about your campaigns.
     * 
     * @param getCampaignsRequest
     * @return Result of the GetCampaigns operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    GetCampaignsResult getCampaigns(GetCampaignsRequest getCampaignsRequest);

    /**
     * Get an email channel
     * 
     * @param getEmailChannelRequest
     * @return Result of the GetEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEmailChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetEmailChannelResult getEmailChannel(GetEmailChannelRequest getEmailChannelRequest);

    /**
     * Returns information about an endpoint.
     * 
     * @param getEndpointRequest
     * @return Result of the GetEndpoint operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    GetEndpointResult getEndpoint(GetEndpointRequest getEndpointRequest);

    /**
     * Returns the event stream for an app.
     * 
     * @param getEventStreamRequest
     *        GetEventStream Request
     * @return Result of the GetEventStream operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    GetEventStreamResult getEventStream(GetEventStreamRequest getEventStreamRequest);

    /**
     * Returns information about the GCM channel for an app.
     * 
     * @param getGcmChannelRequest
     * @return Result of the GetGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetGcmChannelResult getGcmChannel(GetGcmChannelRequest getGcmChannelRequest);

    /**
     * Returns information about an import job.
     * 
     * @param getImportJobRequest
     * @return Result of the GetImportJob operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJob" target="_top">AWS API
     *      Documentation</a>
     */
    GetImportJobResult getImportJob(GetImportJobRequest getImportJobRequest);

    /**
     * Returns information about your import jobs.
     * 
     * @param getImportJobsRequest
     * @return Result of the GetImportJobs operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetImportJobs" target="_top">AWS API
     *      Documentation</a>
     */
    GetImportJobsResult getImportJobs(GetImportJobsRequest getImportJobsRequest);

    /**
     * Returns information about a segment.
     * 
     * @param getSegmentRequest
     * @return Result of the GetSegment operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegment" target="_top">AWS API
     *      Documentation</a>
     */
    GetSegmentResult getSegment(GetSegmentRequest getSegmentRequest);

    /**
     * Returns a list of import jobs for a specific segment.
     * 
     * @param getSegmentImportJobsRequest
     * @return Result of the GetSegmentImportJobs operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegmentImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    GetSegmentImportJobsResult getSegmentImportJobs(GetSegmentImportJobsRequest getSegmentImportJobsRequest);

    /**
     * Returns information about a segment version.
     * 
     * @param getSegmentVersionRequest
     * @return Result of the GetSegmentVersion operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegmentVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersion" target="_top">AWS API
     *      Documentation</a>
     */
    GetSegmentVersionResult getSegmentVersion(GetSegmentVersionRequest getSegmentVersionRequest);

    /**
     * Returns information about your segment versions.
     * 
     * @param getSegmentVersionsRequest
     * @return Result of the GetSegmentVersions operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegmentVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegmentVersions" target="_top">AWS
     *      API Documentation</a>
     */
    GetSegmentVersionsResult getSegmentVersions(GetSegmentVersionsRequest getSegmentVersionsRequest);

    /**
     * Used to get information about your segments.
     * 
     * @param getSegmentsRequest
     * @return Result of the GetSegments operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSegments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSegments" target="_top">AWS API
     *      Documentation</a>
     */
    GetSegmentsResult getSegments(GetSegmentsRequest getSegmentsRequest);

    /**
     * Get an SMS channel
     * 
     * @param getSmsChannelRequest
     * @return Result of the GetSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.GetSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetSmsChannelResult getSmsChannel(GetSmsChannelRequest getSmsChannelRequest);

    /**
     * Use to create or update the event stream for an app.
     * 
     * @param putEventStreamRequest
     * @return Result of the PutEventStream operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.PutEventStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEventStream" target="_top">AWS API
     *      Documentation</a>
     */
    PutEventStreamResult putEventStream(PutEventStreamRequest putEventStreamRequest);

    /**
     * Send a batch of messages
     * 
     * @param sendMessagesRequest
     * @return Result of the SendMessages operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.SendMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendMessages" target="_top">AWS API
     *      Documentation</a>
     */
    SendMessagesResult sendMessages(SendMessagesRequest sendMessagesRequest);

    /**
     * Send a batch of messages to users
     * 
     * @param sendUsersMessagesRequest
     * @return Result of the SendUsersMessages operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.SendUsersMessages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SendUsersMessages" target="_top">AWS API
     *      Documentation</a>
     */
    SendUsersMessagesResult sendUsersMessages(SendUsersMessagesRequest sendUsersMessagesRequest);

    /**
     * Update an ADM channel
     * 
     * @param updateAdmChannelRequest
     * @return Result of the UpdateAdmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateAdmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAdmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAdmChannelResult updateAdmChannel(UpdateAdmChannelRequest updateAdmChannelRequest);

    /**
     * Use to update the APNs channel for an app.
     * 
     * @param updateApnsChannelRequest
     * @return Result of the UpdateApnsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateApnsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateApnsChannelResult updateApnsChannel(UpdateApnsChannelRequest updateApnsChannelRequest);

    /**
     * Update an APNS sandbox channel
     * 
     * @param updateApnsSandboxChannelRequest
     * @return Result of the UpdateApnsSandboxChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateApnsSandboxChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApnsSandboxChannel"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApnsSandboxChannelResult updateApnsSandboxChannel(UpdateApnsSandboxChannelRequest updateApnsSandboxChannelRequest);

    /**
     * Used to update the settings for an app.
     * 
     * @param updateApplicationSettingsRequest
     * @return Result of the UpdateApplicationSettings operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateApplicationSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateApplicationSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationSettingsResult updateApplicationSettings(UpdateApplicationSettingsRequest updateApplicationSettingsRequest);

    /**
     * Update a BAIDU GCM channel
     * 
     * @param updateBaiduChannelRequest
     * @return Result of the UpdateBaiduChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateBaiduChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateBaiduChannel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateBaiduChannelResult updateBaiduChannel(UpdateBaiduChannelRequest updateBaiduChannelRequest);

    /**
     * Use to update a campaign.
     * 
     * @param updateCampaignRequest
     * @return Result of the UpdateCampaign operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateCampaignResult updateCampaign(UpdateCampaignRequest updateCampaignRequest);

    /**
     * Update an email channel
     * 
     * @param updateEmailChannelRequest
     * @return Result of the UpdateEmailChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateEmailChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEmailChannel" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateEmailChannelResult updateEmailChannel(UpdateEmailChannelRequest updateEmailChannelRequest);

    /**
     * Use to update an endpoint.
     * 
     * @param updateEndpointRequest
     * @return Result of the UpdateEndpoint operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateEndpoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpoint" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateEndpointResult updateEndpoint(UpdateEndpointRequest updateEndpointRequest);

    /**
     * Use to update a batch of endpoints.
     * 
     * @param updateEndpointsBatchRequest
     * @return Result of the UpdateEndpointsBatch operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateEndpointsBatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateEndpointsBatch" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateEndpointsBatchResult updateEndpointsBatch(UpdateEndpointsBatchRequest updateEndpointsBatchRequest);

    /**
     * Use to update the GCM channel for an app.
     * 
     * @param updateGcmChannelRequest
     * @return Result of the UpdateGcmChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateGcmChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateGcmChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGcmChannelResult updateGcmChannel(UpdateGcmChannelRequest updateGcmChannelRequest);

    /**
     * Use to update a segment.
     * 
     * @param updateSegmentRequest
     * @return Result of the UpdateSegment operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateSegment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSegment" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSegmentResult updateSegment(UpdateSegmentRequest updateSegmentRequest);

    /**
     * Update an SMS channel
     * 
     * @param updateSmsChannelRequest
     * @return Result of the UpdateSmsChannel operation returned by the service.
     * @throws BadRequestException
     *         Simple message object.
     * @throws InternalServerErrorException
     *         Simple message object.
     * @throws ForbiddenException
     *         Simple message object.
     * @throws NotFoundException
     *         Simple message object.
     * @throws MethodNotAllowedException
     *         Simple message object.
     * @throws TooManyRequestsException
     *         Simple message object.
     * @sample AmazonPinpoint.UpdateSmsChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateSmsChannel" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSmsChannelResult updateSmsChannel(UpdateSmsChannelRequest updateSmsChannelRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}