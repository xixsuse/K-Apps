package com.kufed.id.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbook on 8/4/16.
 */
public class PojoResponseAddressList {
    @SerializedName("time")
    @Expose
    private Double time;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private Data data;

    /**
     *
     * @return
     * The time
     */
    public Double getTime() {
        return time;
    }

    /**
     *
     * @param time
     * The time
     */
    public void setTime(Double time) {
        this.time = time;
    }

    /**
     *
     * @return
     * The status
     */
    public Status getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The data
     */
    public Data getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(Data data) {
        this.data = data;
    }




    public class Data {

        @SerializedName("addresses")
        @Expose
        private List<Address> addresses = new ArrayList<Address>();
        @SerializedName("total")
        @Expose
        private String total;

        /**
         *
         * @return
         * The addresses
         */
        public List<Address> getAddresses() {
            return addresses;
        }

        /**
         *
         * @param addresses
         * The addresses
         */
        public void setAddresses(List<Address> addresses) {
            this.addresses = addresses;
        }

        /**
         *
         * @return
         * The total
         */
        public String getTotal() {
            return total;
        }

        /**
         *
         * @param total
         * The total
         */
        public void setTotal(String total) {
            this.total = total;
        }


        public class Address {

            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("address_label")
            @Expose
            private String addressLabel;
            @SerializedName("country_id")
            @Expose
            private Integer countryId;
            @SerializedName("country_name")
            @Expose
            private String countryName;
            @SerializedName("province_id")
            @Expose
            private Integer provinceId;
            @SerializedName("province_name")
            @Expose
            private String provinceName;
            @SerializedName("city_id")
            @Expose
            private Integer cityId;
            @SerializedName("city_name")
            @Expose
            private String cityName;
            @SerializedName("kecamatan_id")
            @Expose
            private String kecamatanId;
            @SerializedName("kecamatan_name")
            @Expose
            private String kecamatanName;
            @SerializedName("address_complete_name")
            @Expose
            private String addressCompleteName;
            @SerializedName("address_post_code")
            @Expose
            private String addressPostCode;
            @SerializedName("address_phone")
            @Expose
            private String addressPhone;
            @SerializedName("address_optional_phone")
            @Expose
            private String addressOptionalPhone;
            @SerializedName("address_detail")
            @Expose
            private String addressDetail;
            @SerializedName("is_primary")
            @Expose
            private Boolean isPrimary;
            @SerializedName("rate_id")
            @Expose
            private Object rateId;


            /**
             *
             * @return
             * The id
             */
            public Integer getId() {
                return id;
            }

            /**
             *
             * @param id
             * The id
             */
            public void setId(Integer id) {
                this.id = id;
            }

            /**
             *
             * @return
             * The addressLabel
             */
            public String getAddressLabel() {
                return addressLabel;
            }

            /**
             *
             * @param addressLabel
             * The address_label
             */
            public void setAddressLabel(String addressLabel) {
                this.addressLabel = addressLabel;
            }

            /**
             *
             * @return
             * The countryId
             */
            public Integer getCountryId() {
                return countryId;
            }

            /**
             *
             * @param countryId
             * The country_id
             */
            public void setCountryId(Integer countryId) {
                this.countryId = countryId;
            }

            /**
             *
             * @return
             * The countryName
             */
            public String getCountryName() {
                return countryName;
            }

            /**
             *
             * @param countryName
             * The country_name
             */
            public void setCountryName(String countryName) {
                this.countryName = countryName;
            }

            /**
             *
             * @return
             * The provinceId
             */
            public Integer getProvinceId() {
                return provinceId;
            }

            /**
             *
             * @param provinceId
             * The province_id
             */
            public void setProvinceId(Integer provinceId) {
                this.provinceId = provinceId;
            }

            /**
             *
             * @return
             * The provinceName
             */
            public String getProvinceName() {
                return provinceName;
            }

            /**
             *
             * @param provinceName
             * The province_name
             */
            public void setProvinceName(String provinceName) {
                this.provinceName = provinceName;
            }

            /**
             *
             * @return
             * The cityId
             */
            public Integer getCityId() {
                return cityId;
            }

            /**
             *
             * @param cityId
             * The city_id
             */
            public void setCityId(Integer cityId) {
                this.cityId = cityId;
            }

            /**
             *
             * @return
             * The cityName
             */
            public String getCityName() {
                return cityName;
            }

            /**
             *
             * @param cityName
             * The city_name
             */
            public void setCityName(String cityName) {
                this.cityName = cityName;
            }

            /**
             *
             * @return
             * The kecamatanId
             */
            public String getKecamatanId() {
                return kecamatanId;
            }

            /**
             *
             * @param kecamatanId
             * The kecamatan_id
             */
            public void setKecamatanId(String kecamatanId) {
                this.kecamatanId = kecamatanId;
            }

            /**
             *
             * @return
             * The kecamatanName
             */
            public String getKecamatanName() {
                return kecamatanName;
            }

            /**
             *
             * @param kecamatanName
             * The kecamatan_name
             */
            public void setKecamatanName(String kecamatanName) {
                this.kecamatanName = kecamatanName;
            }

            /**
             *
             * @return
             * The addressCompleteName
             */
            public String getAddressCompleteName() {
                return addressCompleteName;
            }

            /**
             *
             * @param addressCompleteName
             * The address_complete_name
             */
            public void setAddressCompleteName(String addressCompleteName) {
                this.addressCompleteName = addressCompleteName;
            }

            /**
             *
             * @return
             * The addressPostCode
             */
            public String getAddressPostCode() {
                return addressPostCode;
            }

            /**
             *
             * @param addressPostCode
             * The address_post_code
             */
            public void setAddressPostCode(String addressPostCode) {
                this.addressPostCode = addressPostCode;
            }

            /**
             *
             * @return
             * The addressPhone
             */
            public String getAddressPhone() {
                return addressPhone;
            }

            /**
             *
             * @param addressPhone
             * The address_phone
             */
            public void setAddressPhone(String addressPhone) {
                this.addressPhone = addressPhone;
            }

            /**
             *
             * @return
             * The addressOptionalPhone
             */
            public String getAddressOptionalPhone() {
                return addressOptionalPhone;
            }

            /**
             *
             * @param addressOptionalPhone
             * The address_optional_phone
             */
            public void setAddressOptionalPhone(String addressOptionalPhone) {
                this.addressOptionalPhone = addressOptionalPhone;
            }

            /**
             *
             * @return
             * The addressDetail
             */
            public String getAddressDetail() {
                return addressDetail;
            }

            /**
             *
             * @param addressDetail
             * The address_detail
             */
            public void setAddressDetail(String addressDetail) {
                this.addressDetail = addressDetail;
            }

            /**
             *
             * @return
             * The isPrimary
             */
            public Boolean getIsPrimary() {
                return isPrimary;
            }

            /**
             *
             * @param isPrimary
             * The is_primary
             */
            public void setIsPrimary(Boolean isPrimary) {
                this.isPrimary = isPrimary;
            }

            /**
             *
             * @return
             * The rateId
             */
            public Object getRateId() {
                return rateId;
            }

            /**
             *
             * @param rateId
             * The rate_id
             */
            public void setRateId(Object rateId) {
                this.rateId = rateId;
            }

        }

    }

    public class Status {

        @SerializedName("code")
        @Expose
        private Integer code;
        @SerializedName("description")
        @Expose
        private String description;

        /**
         *
         * @return
         * The code
         */
        public Integer getCode() {
            return code;
        }

        /**
         *
         * @param code
         * The code
         */
        public void setCode(Integer code) {
            this.code = code;
        }

        /**
         *
         * @return
         * The description
         */
        public String getDescription() {
            return description;
        }

        /**
         *
         * @param description
         * The description
         */
        public void setDescription(String description) {
            this.description = description;
        }

    }
}
