db.zipcodes.aggregate([{$group:{_id :{city : "$city", state : "$state"},avgpop :{$avg :"$pop"}}}]) 
