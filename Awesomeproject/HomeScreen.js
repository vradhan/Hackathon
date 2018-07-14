import React from 'react'
import {TouchableHighlight, Text, View,StyleSheet, Image} from 'react-native'

export default class HomeScreen extends React.Component {
    static navigationOptions = {
        title: 'Welcome',
    };
    render() {
        const { navigate } = this.props.navigation;
        return (
            <View style={styles.container}>
                <Image source={require('./download1.jpg')} />
                <TouchableHighlight
                    onPress={() => navigate("Chart", {screen: "Chart"})}
                    style={styles.button}>
                    <Text
                        style={styles.buttonText}>Click here to go to App</Text>
                </TouchableHighlight>
            </View>

        );
    }
};
const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center'
    },
    button: {
        alignSelf: 'stretch',
        marginLeft: 10,
        marginRight: 10,
        borderRadius: 5,
        height: 40,
        justifyContent: 'center'
    },
    buttonText: {
        color: 'blue',
        fontSize: 22,
        alignSelf: 'center'
    }
});