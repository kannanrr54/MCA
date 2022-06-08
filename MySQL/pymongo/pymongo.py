from pymongo import MongoClient
#mongodb+srv://<username>:<pass>@cluster0.hxeu7bl.mongodb.net/?retryWrites=true&w=majority
client=MongoClient("mongodb+srv://jeslin:jes@cluster0.hxeu7bl.mongodb.net/?retryWrites=true&w=majority")
db=client.gettingStarted
people=db.people
p={"name":{"First":"Jes"}}
people.insert_one(p)
