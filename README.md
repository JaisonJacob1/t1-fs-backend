# t1-fs-backend

# Build Command 

./gradlew clean build

# Run Command  

./gradlew bootRun

# EndPoints

https://t1-fs-backend.herokuapp.com//bulletinBoard - to load all the contents.

https://t1-fs-backend.herokuapp.com//bulletinBoard/create - to create content. Request is a json body and resposne also.


https://t1-fs-backend.herokuapp.com//bulletinBoard/search/category/{category} - to search by category

https://t1-fs-backend.herokuapp.com//bulletinBoard/search/id/{id} - to search by id

https://t1-fs-backend.herokuapp.com//bulletinBoard/search/{Search String} - to search from all items by content title

https://t1-fs-backend.herokuapp.com/bulletinBoard/id/{entryID}/comment - to add comments for a particular post

# Request format general

{
	"contentTitle" : "",
	"category":"",
	"contentDescription" : "",
	"imageUrl" : "",
	"createDateTime" : ""
}

# Request format for comment

{
	"userName" : "",
	"description" : "",
}

# Response Format

{
	"contentTitle" : "",
	"category":"",
	"contentDescription" : "",
	"imageUrl" : "",
	"createDateTime" : ""
	"comment" : {
		"commentID" : "",
		"masterID" : "",
		"userName" : "",
		"description" : ""
	}
}


