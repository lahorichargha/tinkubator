package org.linkedprocess.xmpp.villein;

import java.util.Map;
import java.util.HashMap;

/**
 * User: marko
 * Date: Jul 8, 2009
 * Time: 9:13:19 AM
 */
public class VmStruct extends Struct {

    protected String vmPassword;
    protected String vmSpecies;
    protected Map<String, Job> jobs = new HashMap<String, Job>();

    public void setVmPassword(final String vmPassword) {
        this.vmPassword = vmPassword;
    }

    public String getVmPassword() {
        return this.vmPassword;
    }

    public void setVmSpecies(final String vmSpecies) {
        this.vmSpecies = vmSpecies;
    }

    public String getVmSpecies() {
        return this.vmSpecies;
    }

    public void addJob(Job job) {
        this.jobs.put(job.getJobId(), job);
    }

    public Job getJob(String jobId) {
        return this.jobs.get(jobId);   
    }

    public void removeJob(String jobId) {
        this.jobs.remove(jobId);
    }

    public void clearJobs() {
        this.jobs.clear();
    }
}

