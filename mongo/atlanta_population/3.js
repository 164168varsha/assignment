db.getCollection('zipcodes').aggregate([{$match:{city:"ATLANTA"}},{$count:"mycount"}])