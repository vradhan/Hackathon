import React, { Component } from 'react';
import { StyleSheet, View, ScrollView } from 'react-native';
import { Table, TableWrapper, Row } from 'react-native-table-component';
import { List, ListItem } from 'react-native-elements';

export default class MachineOutputPast extends Component {
    constructor(props) {
        super(props);
        this.state = {
            tableHead: ['MachineID', 'Time Period', 'Output', 'Date'],
            widthArr: [40, 60, 80, 100]
        }
    }

    /* const list = [
         {
             name: 'Amy Farha',
             avatar_url: 'https://s3.amazonaws.com/uifaces/faces/twitter/ladylexy/128.jpg',
             subtitle: 'Vice President'
         },
         {
             name: 'Chris Jackson',
             avatar_url: 'https://s3.amazonaws.com/uifaces/faces/twitter/adhamdannaway/128.jpg',
             subtitle: 'Vice Chairman'
         },
         ... // more items
     ]*/


    render() {
        const state = this.state;
        const tableData = [];
        for (let i = 0; i < 4; i += 1) {
            const rowData = [];
            for (let j = 0; j < 9; j += 1) {
                rowData.push(`${i}${j}`);
            }
            tableData.push(rowData);
        }

        return (
            <View style={styles.container}>
                <ScrollView horizontal={true}>
                    <View>
                        <Table borderStyle={{borderColor: '#C1C0B9'}}>
                            <Row data={state.tableHead} widthArr={state.widthArr} style={styles.header} textStyle={styles.text}/>
                        </Table>
                        <ScrollView style={styles.dataWrapper}>
                            <Table borderStyle={{borderColor: '#C1C0B9'}}>
                                {
                                    tableData.map((rowData, index) => (
                                        <Row
                                            key={index}
                                            data={rowData}
                                            widthArr={state.widthArr}
                                            style={[styles.row, index%2 && {backgroundColor: '#F7F6E7'}]}
                                            textStyle={styles.text}
                                        />
                                    ))
                                }
                            </Table>
                        </ScrollView>
                    </View>
                </ScrollView>
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
