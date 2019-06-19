import { ADD_PLACE, DELET_PLACE, SELECT_PLACE, DESELECT_PLACE } from '../actions/actionTypes'

const initialState = {
    places: [],
    selectedPlace: null
};

const reducer = (state = initialState, action) => {
    switch(action.type) {
        case ADD_PLACE:
            return {
                ...state,
                places: state.places.concat({
                    key: Math.random(), 
                    name: action.placeName, 
                    image: {
                      uri: "https://i.scdn.co/image/5b2072e522bf3324019a8c2dc3db20116dff0b87"
                    }
                  }) 
            };
        case DELET_PLACE:
            return{
                ...state,
                places: state.places.filter(place  => {
                    return  place.key !== state.selectedPlace.key;
                  }),
                  selectedPlace: null
            };
        case SELECT_PLACE:
            return{
                ...state,
                selectedPlace: state.places.find(place =>{
                    return place.key === action.placeKey;
                  })
            };
        case DESELECT_PLACE:
            return{
                ...state,
                selectedPlace: null
            }
        default:
            return state;
    }
};

export default reducer;