 db.zipcodes.aggregate([{$group:{_id :{city : "$city", state : "$state"},avgpop :{$avg :"$pop"}}},{$sort:{avgpop : -1}},{$limit :3}])
 