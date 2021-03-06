package com.onecode.s3.model;

import java.io.Serializable;

public class S3BucketData implements Serializable {

    private S3Credentials s3Credentials;
    private String region;
    private String bucket;
    private String key;

    private S3BucketData() {
    }

    public S3Credentials getS3Credentials() {
        return s3Credentials;
    }

    public String getRegion() {
        return region;
    }

    public String getBucket() {
        return bucket;
    }

    public String getKey() {
        return key;
    }

    public static class Builder {

        private S3BucketData s3BucketData;

        public Builder() {
            s3BucketData = new S3BucketData();
        }

        public Builder setCredentials(S3Credentials s3Credentials) {
            s3BucketData.s3Credentials = s3Credentials;
            return this;
        }

        public Builder setRegion(String region) {
            s3BucketData.region = region;
            return this;
        }

        public Builder setBucket(String bucket) {
            s3BucketData.bucket = bucket;
            return this;
        }

        public Builder setKey(String key) {
            s3BucketData.key = key;
            return this;
        }

        public S3BucketData build() {
            return s3BucketData;
        }
    }
}