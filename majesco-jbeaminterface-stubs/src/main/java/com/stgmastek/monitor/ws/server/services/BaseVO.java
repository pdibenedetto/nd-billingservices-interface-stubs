package com.stgmastek.monitor.ws.server.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseVO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="baseVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseVO")
@XmlSeeAlso({
                ProgressLevelData.class,
                InstallationEntity.class,
                UserDetails.class,
                ObjectExecutionGraphData.class,
                InstructionLog.class,
                MenuData.class,
                RoleData.class,
                Installation.class,
                BatchDetails.class,
                BatchObject.class,
                BatchInfo.class,
                ListenerInfo.class,
                MonitorCalendarData.class,
                SystemDetails.class,
                DropDownEntry.class,
                ProcessRequestScheduleData.class,
                InstallationData.class,
                ConfigParameter.class,
                UserInstallationRole.class,
                BaseResponseVO.class,
                BaseRequestVO.class,
                FailedObjectDetails.class
            })
public class BaseVO
{


}
