from pymongo import MongoClient
client=MongoClient("mongodb+srv://jeslin:jes@cluster0.hxeu7bl.mongodb.net/?retryWrites=true&w=majority")
db=client.gettingStarted
people=db.people
p={"name":{"First":"Jes"}}
people.insert_one(p)