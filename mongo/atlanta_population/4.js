db.getCollection('zipcodes').aggregate([{$match:{"city":"ATLANTA"}},{$group:{_id: "$city",total:{$sum:"$pop"}}}])