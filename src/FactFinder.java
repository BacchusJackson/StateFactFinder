public class FactFinder {
  private State[] states;
  private String tableHeader;
  private String queryLog;

  public FactFinder() {

    // Put all of the states and information into arrays
    states = new State[50];
    states[0] = new State("Alabama", "Yellowhammer", "Camellia");
    states[1] = new State("Alaska", "Willow Ptarmigan", "Forget Me Not");
    states[2] = new State("Arizona", "Cactus Wren", "Saguaro Cactus Blossom");
    states[3] = new State("Arkansas", "Mockingbird", "apple blossom");
    states[4] = new State("California", "California Valley Quail", "California Poppy");
    states[5] = new State("Colorado", "Lark Bunting", "Rocky Mountain Columbine");
    states[6] = new State("Connecticut", "Robin", "Mountain laurel");
    states[7] = new State("Delaware", "Blue Hen Chicken", "Peach Blossom");
    states[8] = new State("Florida", "Mockingbird", "Orange Blossom");
    states[9] = new State("Georgia", "Brown Thrasher", "Cherokee Rose");
    states[10] = new State("Hawaii", "Nene", "Pua Aloalo");
    states[11] = new State("Idaho", "Mountain Bluebird", "Syringa - Mock Orange");
    states[12] = new State("Illinois", "Cardinal", "Purple Violet");
    states[13] = new State("Indiana", "Cardinal", "Peony");
    states[14] = new State("Iowa", "Eastern Goldfinch", "Wild Prairie Rose");
    states[15] = new State("Kansas", "Western Meadowlark", "Sunflower");
    states[16] = new State("Kentucky", "Cardinal", "Goldenrod");
    states[17] = new State("Louisiana", "Eastern Brown Pelican", "Magnolia");
    states[18] = new State("Maine", "Chickadee", "White pine cone and tassel");
    states[19] = new State("Maryland", "Baltimore Oriole", "Black-eyed susan");
    states[20] = new State("Massachusetts", "Chickadee", "Trailing-Arbutus");
    states[21] = new State("Michigan", "Robin", "Apple Blossom");
    states[22] = new State("Minnesota", "Common Loon", "Pink and white ladys-slipper");
    states[23] = new State("Mississippi", "Mockingbird", "Magnolia");
    states[24] = new State("Missouri", "Bluebird", "Hawthorn");
    states[25] = new State("Montana", "Western Meadowlark", "Bitterroot");
    states[26] = new State("Nebraska", "Western Meadowlark", "Goldenrod");
    states[27] = new State("Nevada", "Mountain Bluebird", "Sagebrush");
    states[28] = new State("New Hampshire", "Purple Finch", "Purple lilac");
    states[29] = new State("New Jersey", "Eastern Goldfinch", "Violet Viola sororia");
    states[30] = new State("New Mexico", "Roadrunner", "Yucca flower");
    states[31] = new State("New York", "Bluebird", "Rose Rosa");
    states[32] = new State("North Carolina", "Cardinal", "American Dogwood");
    states[33] = new State("North Dakota", "Western Meadowlark", "Wild Prairie Rose");
    states[34] = new State("Ohio", "Cardinal", "Scarlet Carnation");
    states[35] = new State("Oklahoma", "Scissor-tailed Flycatcher", "Mistletoe");
    states[36] = new State("Oregon", "Western Meadowlark", "Oregon Grape");
    states[37] = new State("Pennsylvania", "Ruffed Grouse", "Mountain Laurel");
    states[38] = new State("Rhode Island", "Rhode Island Red", "Violet Viola");
    states[39] = new State("South Carolina", "Great Carolina Wren", "Yellow Jessamine");
    states[40] = new State("South Dakota", "Ring-necked Pheasant", "Pasque Flower");
    states[41] = new State("Tennessee", "Mockingbird", "Iris Iridaceae");
    states[42] = new State("Texas", "Mockingbird", "Bluebonnet");
    states[43] = new State("Utah", "Common American Gull", "Sego lily");
    states[44] = new State("Vermont", "Hermit Thrush", "Red Clover");
    states[45] = new State("Virginia", "Cardinal ", "American Dogwood");
    states[46] = new State("Washington", "Willow Goldfinch", "Coast Rhododendron");
    states[47] = new State("West Virginia", "Cardinal", "Rhododendron");
    states[48] = new State("Wisconsin", "Robin", "Wood Violet	Viola");
    states[49] = new State("Wyoming", "Western Meadowlark", "Indian Paintbrush");

    // Build the header for table output
    StringBuilder headerBuilder = new StringBuilder();

    // Append headers and divider
    headerBuilder.append(String.format("%-30s | %-30s | %-30s\n", "State", "State Bird", "State Flower"));

    // Loop to add all of the dashes
    for(int i = 0; i<6;i++) {
      headerBuilder.append("----------------");
    }

    // Add a line break
    headerBuilder.append("\n");

    tableHeader = headerBuilder.toString();
  }

  public String getAllStatesInfo() {
    // Create Header and body objects
    StringBuilder body = new StringBuilder();

    // Loop through each state and add it to the table
    for(State state : states) {

        body.append(state.toString());
    }
    // Combine the header and body
    return tableHeader + body.toString();
  }

  public String getStateInfo(String stateName) {

    // Find a match for the name in the parameter
    for(State state: states) {
      if(state.getName().equalsIgnoreCase(stateName.trim()) ) {
        appendQueryLog(state.toString());
        return tableHeader + state.toString();
      }
    }
    return "Sorry, State Not Found";
  }

  private void appendQueryLog(String stateInfo) {

    if(queryLog==null) {
      queryLog = stateInfo;
    } else {
      queryLog+= stateInfo;
    }

  }

  public String getQueryLog() {
    return tableHeader + queryLog;
  }

}
