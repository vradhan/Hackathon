import React, { Component } from 'react';
import { StyleSheet, View, ScrollView } from 'react-native';
import { Table, TableWrapper, Row, Rows } from 'react-native-table-component';
import { List, ListItem } from 'react-native-elements';

export default class MachineOutputToday extends Component {
    constructor(props) {
        super(props);
        this.state = {
            tableHead: ['MachineID', 'Time Period', 'Output', 'Date'],
            tableData: [
                ['001', '9-10', '26', '15-Jul-2018'],
                ['001', '10-11', '40', '15-Jul-2018'],
                ['001', '11-12', '32', '15-Jul-2018'],
                ['001', '12-13', '30', '15-Jul-2018']
            ]
        }
    }

    render() {
        const state = this.state;


        return (
            <View style={styles.container}>

                    <Table borderStyle={{borderWidth: 2, borderColor: '#c8e1ff'}} heightArr={[32,32]}>
                        <Row data={state.tableHead} style={styles.head} textStyle={styles.text}/>
                        <Rows data={state.tableData} textStyle={styles.text}/>
                    </Table>

            </View>
        )
    }
}

const styles = StyleSheet.create({
    container: { flex: 1, padding: 16, paddingTop: 30, backgroundColor: '#fff' },
    header: { height: 50, backgroundColor: '#537791' },
    text: { textAlign: 'center', fontWeight: '100' },
    dataWrapper: { marginTop: -1 },
    row: { height: 40, backgroundColor: '#E7E6E1' }
});
