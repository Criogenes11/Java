The twelve data files - wolf_creek_hourly_{01,12}.csv - 
represent the hourly readings for the Wolf Creek Dam
in Russell County, Kentucky, USA.
Each line is an hourly observation; each file contains
the hourly readings of some vital dam hyrdological stats.

Specifically, the four fields in each observation are as follows:

"GAGE TIME UTC (ISO-8601)" , "ELEVATION UPSTREAM" , "ELEVATION DOWNSTREAM" , "DISCHARGE HOURLY AVG."

The Gage Time is the time the three other fields are observed.
Upstream Elevation is the water table height in mean feat above sea level (famsl)
above the dam - i.e., the Lake Cumberland lake level elevation/height above the dam.
The Downstream Elevation is the water table height (famsl) below the dam 
- i.e., the elevation of the water table in the Cumberland River immediately downstream/below 
the dam/lake.
The Discharge Rate is a measurement of pertaining to letting water through the generators 
(out of lake, over the dam, and into the river below).

Both the discharge rate and the downstream elevation are of little value for the 
labs in this sequence. 

The upstream elevation readings are of importance because the labs utilizing this data
revolve around a scenario of safety/water monitoring of the water table height/level/elevation
in the Lake Cumberland watershed.