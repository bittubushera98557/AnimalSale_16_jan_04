package com.example.lenovo.emptypro.ModelClasses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllApiResponse {
    /*{"messageType": "success", "message": "Feedback submitted"}*/
    public class CommonRes {
        public String messageType;
        public String message;
    }

    public class CategoryResponse {
        @SerializedName("data")
        @Expose
        private List<CategoryMainListModel> data = null;
        @SerializedName("messageType")
        @Expose
        private String messageType;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("message")
        @Expose
        private String message;

        public List<CategoryMainListModel> getData() {
            return data;
        }

        public void setData(List<CategoryMainListModel> data) {
            this.data = data;
        }

        public String getMessageType() {
            return messageType;
        }

        public void setMessageType(String messageType) {
            this.messageType = messageType;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public class CategoryMainListModel {
            @SerializedName("categoryID")
            @Expose
            private Integer categoryID;
            @SerializedName("title")
            @Expose
            private String title;
            @SerializedName("imgUrl")
            @Expose
            private String imgUrl;
            @SerializedName("subCat")
            @Expose
            private List<CategorySubListModel> subCat = null;

            public Integer getCategoryID() {
                return categoryID;
            }

            public void setCategoryID(Integer categoryID) {
                this.categoryID = categoryID;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImgUrl() {
                return imgUrl;
            }

            public void setImgUrl(String imgUrl) {
                this.imgUrl = imgUrl;
            }

            public List<CategorySubListModel> getSubCat() {
                return subCat;
            }

            public void setSubCat(List<CategorySubListModel> subCat) {
                this.subCat = subCat;
            }

        }

        public class CategorySubListModel {


            @SerializedName("subID")
            @Expose
            private Integer subID;
            @SerializedName("categoryID")
            @Expose
            private Integer categoryID;
            @SerializedName("subCategoryTitle")
            @Expose
            private String subCategoryTitle;

            public Integer getSubID() {
                return subID;
            }

            public void setSubID(Integer subID) {
                this.subID = subID;
            }

            public Integer getCategoryID() {
                return categoryID;
            }

            public void setCategoryID(Integer categoryID) {
                this.categoryID = categoryID;
            }

            public String getSubCategoryTitle() {
                return subCategoryTitle;
            }

            public void setSubCategoryTitle(String subCategoryTitle) {
                this.subCategoryTitle = subCategoryTitle;
            }
        }
    }

    public class OtpResponse {


        @SerializedName("data")
        @Expose
        private OtpModel data;
        @SerializedName("messageType")
        @Expose
        private String messageType;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("message")
        @Expose
        private String message;

        public OtpModel getData() {
            return data;
        }

        public void setData(OtpModel data) {
            this.data = data;
        }

        public String getMessageType() {
            return messageType;
        }

        public void setMessageType(String messageType) {
            this.messageType = messageType;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public class OtpModel {

            @SerializedName("otp")
            @Expose
            private Integer otp;

            public Integer getOtp() {
                return otp;
            }

            public void setOtp(Integer otp) {
                this.otp = otp;
            }
        }
    }
public class VerifyOtpRes{


    @SerializedName("userID")
    @Expose
    private String userID;
        @SerializedName("messageType")
    @Expose
    private String messageType;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}

    public static class ChatModel {
        @SerializedName("status")
        private String status;
        @SerializedName("name")
        private String name;
        @SerializedName("image")
        private String image;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class AllTypePetsRes {

        @SerializedName("data")
        @Expose
        private PetsData data;
        @SerializedName("messageType")
        @Expose
        private String messageType;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("message")
        @Expose
        private String message;

        public PetsData getData() {
            return data;
        }

        public void setData(PetsData data) {
            this.data = data;
        }

        public String getMessageType() {
            return messageType;
        }

        public void setMessageType(String messageType) {
            this.messageType = messageType;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public class PetsData {

            @SerializedName("petData")
            @Expose
            private List<PetDatum> petData = null;

            public List<PetDatum> getPetData() {
                return petData;
            }

            public void setPetData(List<PetDatum> petData) {
                this.petData = petData;
            }


            public class PetDatum {

                @SerializedName("petID")
                @Expose
                private Integer petID;
                @SerializedName("category")
                @Expose
                private String category;
                @SerializedName("subCategory")
                @Expose
                private String subCategory;
                @SerializedName("petName")
                @Expose
                private String petName;
                @SerializedName("petTitle")
                @Expose
                private String petTitle;
                @SerializedName("petPrice")
                @Expose
                private String petPrice;
                @SerializedName("petAge")
                @Expose
                private String petAge;
                @SerializedName("petBreed")
                @Expose
                private String petBreed;
                @SerializedName("petDescription")
                @Expose
                private String petDescription;
                @SerializedName("images")
                @Expose
                private List<ImageData> images = null;

                public Integer getPetID() {
                    return petID;
                }

                public void setPetID(Integer petID) {
                    this.petID = petID;
                }

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public String getSubCategory() {
                    return subCategory;
                }

                public void setSubCategory(String subCategory) {
                    this.subCategory = subCategory;
                }

                public String getPetName() {
                    return petName;
                }

                public void setPetName(String petName) {
                    this.petName = petName;
                }

                public String getPetTitle() {
                    return petTitle;
                }

                public void setPetTitle(String petTitle) {
                    this.petTitle = petTitle;
                }

                public String getPetPrice() {
                    return petPrice;
                }

                public void setPetPrice(String petPrice) {
                    this.petPrice = petPrice;
                }

                public String getPetAge() {
                    return petAge;
                }

                public void setPetAge(String petAge) {
                    this.petAge = petAge;
                }

                public String getPetBreed() {
                    return petBreed;
                }

                public void setPetBreed(String petBreed) {
                    this.petBreed = petBreed;
                }

                public String getPetDescription() {
                    return petDescription;
                }

                public void setPetDescription(String petDescription) {
                    this.petDescription = petDescription;
                }

                public List<ImageData> getImages() {
                    return images;
                }

                public void setImages(List<ImageData> images) {
                    this.images = images;
                }

                public class ImageData {


                    @SerializedName("petID")
                    @Expose
                    private Integer petID;
                    @SerializedName("isDefault")
                    @Expose
                    private Integer isDefault;
                    @SerializedName("img")
                    @Expose
                    private String img;

                    public Integer getPetID() {
                        return petID;
                    }

                    public void setPetID(Integer petID) {
                        this.petID = petID;
                    }

                    public Integer getIsDefault() {
                        return isDefault;
                    }

                    public void setIsDefault(Integer isDefault) {
                        this.isDefault = isDefault;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }

                }
            }
        }
    }

    public class UploadedPetsRes {


        @SerializedName("data")
        @Expose
        private UploadedPetsItem data;
        @SerializedName("messageType")
        @Expose
        private String messageType;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("message")
        @Expose
        private String message;

        public UploadedPetsItem getData() {
            return data;
        }

        public void setData(UploadedPetsItem data) {
            this.data = data;
        }

        public String getMessageType() {
            return messageType;
        }

        public void setMessageType(String messageType) {
            this.messageType = messageType;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public class UploadedPetsItem {

            @SerializedName("imgData")
            @Expose
            private List<Object> imgData = null;
            @SerializedName("petData")
            @Expose
            private List<PetDatum> petData = null;

            public List<Object> getImgData() {
                return imgData;
            }

            public void setImgData(List<Object> imgData) {
                this.imgData = imgData;
            }

            public List<PetDatum> getPetData() {
                return petData;
            }

            public void setPetData(List<PetDatum> petData) {
                this.petData = petData;
            }


            public class PetDatum {

                @SerializedName("petID")
                @Expose
                private Integer petID;
                @SerializedName("category")
                @Expose
                private String category;
                @SerializedName("subCategory")
                @Expose
                private String subCategory;
                @SerializedName("petName")
                @Expose
                private String petName;
                @SerializedName("petTitle")
                @Expose
                private String petTitle;
                @SerializedName("petPrice")
                @Expose
                private String petPrice;
                @SerializedName("petAge")
                @Expose
                private String petAge;
                @SerializedName("petBreed")
                @Expose
                private String petBreed;
                @SerializedName("petDescription")
                @Expose
                private String petDescription;
                @SerializedName("images")
                @Expose
                private List<ImageData> images = null;

                public Integer getPetID() {
                    return petID;
                }

                public void setPetID(Integer petID) {
                    this.petID = petID;
                }

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public String getSubCategory() {
                    return subCategory;
                }

                public void setSubCategory(String subCategory) {
                    this.subCategory = subCategory;
                }

                public String getPetName() {
                    return petName;
                }

                public void setPetName(String petName) {
                    this.petName = petName;
                }

                public String getPetTitle() {
                    return petTitle;
                }

                public void setPetTitle(String petTitle) {
                    this.petTitle = petTitle;
                }

                public String getPetPrice() {
                    return petPrice;
                }

                public void setPetPrice(String petPrice) {
                    this.petPrice = petPrice;
                }

                public String getPetAge() {
                    return petAge;
                }

                public void setPetAge(String petAge) {
                    this.petAge = petAge;
                }

                public String getPetBreed() {
                    return petBreed;
                }

                public void setPetBreed(String petBreed) {
                    this.petBreed = petBreed;
                }

                public String getPetDescription() {
                    return petDescription;
                }

                public void setPetDescription(String petDescription) {
                    this.petDescription = petDescription;
                }

                public List<ImageData> getImages() {
                    return images;
                }

                public void setImages(List<ImageData> images) {
                    this.images = images;
                }

                public class ImageData {


                    @SerializedName("petID")
                    @Expose
                    private Integer petID;
                    @SerializedName("isDefault")
                    @Expose
                    private Integer isDefault;
                    @SerializedName("img")
                    @Expose
                    private String img;

                    public Integer getPetID() {
                        return petID;
                    }

                    public void setPetID(Integer petID) {
                        this.petID = petID;
                    }

                    public Integer getIsDefault() {
                        return isDefault;
                    }

                    public void setIsDefault(Integer isDefault) {
                        this.isDefault = isDefault;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }
                }
            }
        }

    }

    public class FavouritePetsRes {

        @SerializedName("data")
        @Expose
        private FavouritePetsData data;
        @SerializedName("messageType")
        @Expose
        private String messageType;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("status")
        @Expose
        private String status;

        public FavouritePetsData getData() {
            return data;
        }

        public void setData(FavouritePetsData data) {
            this.data = data;
        }

        public String getMessageType() {
            return messageType;
        }

        public void setMessageType(String messageType) {
            this.messageType = messageType;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public class FavouritePetsData {


            @SerializedName("petData")
            @Expose
            private List<PetDatumItem> petData = null;

            public List<PetDatumItem> getPetData() {
                return petData;
            }

            public void setPetData(List<PetDatumItem> petData) {
                this.petData = petData;
            }

            public class PetDatumItem {


                @SerializedName("petID")
                @Expose
                private Integer petID;
                @SerializedName("category")
                @Expose
                private String category;
                @SerializedName("subCategory")
                @Expose
                private String subCategory;
                @SerializedName("petName")
                @Expose
                private String petName;
                @SerializedName("petTitle")
                @Expose
                private String petTitle;
                @SerializedName("petPrice")
                @Expose
                private String petPrice;
                @SerializedName("petAge")
                @Expose
                private String petAge;
                @SerializedName("petBreed")
                @Expose
                private String petBreed;
                @SerializedName("petDescription")
                @Expose
                private String petDescription;
                @SerializedName("images")
                @Expose
                private List<ImageLst> images = null;

                public Integer getPetID() {
                    return petID;
                }

                public void setPetID(Integer petID) {
                    this.petID = petID;
                }

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public String getSubCategory() {
                    return subCategory;
                }

                public void setSubCategory(String subCategory) {
                    this.subCategory = subCategory;
                }

                public String getPetName() {
                    return petName;
                }

                public void setPetName(String petName) {
                    this.petName = petName;
                }

                public String getPetTitle() {
                    return petTitle;
                }

                public void setPetTitle(String petTitle) {
                    this.petTitle = petTitle;
                }

                public String getPetPrice() {
                    return petPrice;
                }

                public void setPetPrice(String petPrice) {
                    this.petPrice = petPrice;
                }

                public String getPetAge() {
                    return petAge;
                }

                public void setPetAge(String petAge) {
                    this.petAge = petAge;
                }

                public String getPetBreed() {
                    return petBreed;
                }

                public void setPetBreed(String petBreed) {
                    this.petBreed = petBreed;
                }

                public String getPetDescription() {
                    return petDescription;
                }

                public void setPetDescription(String petDescription) {
                    this.petDescription = petDescription;
                }

                public List<ImageLst> getImages() {
                    return images;
                }

                public void setImages(List<ImageLst> images) {
                    this.images = images;
                }

                public class ImageLst {


                    @SerializedName("petID")
                    @Expose
                    private Integer petID;
                    @SerializedName("isDefault")
                    @Expose
                    private Integer isDefault;
                    @SerializedName("img")
                    @Expose
                    private String img;

                    public Integer getPetID() {
                        return petID;
                    }

                    public void setPetID(Integer petID) {
                        this.petID = petID;
                    }

                    public Integer getIsDefault() {
                        return isDefault;
                    }

                    public void setIsDefault(Integer isDefault) {
                        this.isDefault = isDefault;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }
                }

            }

        }

    }

    public class SoldPetsRes {


        @SerializedName("data")
        @Expose
        private List<SoldPetsData> data = null;
        @SerializedName("messageType")
        @Expose
        private String messageType;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("status")
        @Expose
        private String status;

        public List<SoldPetsData> getData() {
            return data;
        }

        public void setData(List<SoldPetsData> data) {
            this.data = data;
        }

        public String getMessageType() {
            return messageType;
        }

        public void setMessageType(String messageType) {
            this.messageType = messageType;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public class  SoldPetsData {


            @SerializedName("petID")
            @Expose
            private Integer petID;
            @SerializedName("category")
            @Expose
            private String category;
            @SerializedName("subCategory")
            @Expose
            private String subCategory;
            @SerializedName("petName")
            @Expose
            private String petName;
            @SerializedName("petTitle")
            @Expose
            private String petTitle;
            @SerializedName("petPrice")
            @Expose
            private String petPrice;
            @SerializedName("petAge")
            @Expose
            private String petAge;
            @SerializedName("petBreed")
            @Expose
            private String petBreed;
            @SerializedName("petDescription")
            @Expose
            private String petDescription;

            public Integer getPetID() {
                return petID;
            }

            public void setPetID(Integer petID) {
                this.petID = petID;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getSubCategory() {
                return subCategory;
            }

            public void setSubCategory(String subCategory) {
                this.subCategory = subCategory;
            }

            public String getPetName() {
                return petName;
            }

            public void setPetName(String petName) {
                this.petName = petName;
            }

            public String getPetTitle() {
                return petTitle;
            }

            public void setPetTitle(String petTitle) {
                this.petTitle = petTitle;
            }

            public String getPetPrice() {
                return petPrice;
            }

            public void setPetPrice(String petPrice) {
                this.petPrice = petPrice;
            }

            public String getPetAge() {
                return petAge;
            }

            public void setPetAge(String petAge) {
                this.petAge = petAge;
            }

            public String getPetBreed() {
                return petBreed;
            }

            public void setPetBreed(String petBreed) {
                this.petBreed = petBreed;
            }

            public String getPetDescription() {
                return petDescription;
            }

            public void setPetDescription(String petDescription) {
                this.petDescription = petDescription;
            }

        }

    }
}
