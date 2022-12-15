
# Rest API documentation with Webflux and MongoDB

Rest API created in order to save and show all playlist`s saved inside the MongoDB database.


## Documentation

#### Return all playlist item`s , all items generate id random.

```http
  GET /playlist
```

#### Returns the specific item identified by ID.

```http
  GET /playlist/{id}
```

| Body   | Type       | Description                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Mandatory**. The ID of the item you want |

#### Save a new item.

```http
  POST /playlist
```

| Body   | ConcentType       | Description                                   |
| :---------- | :--------- | :------------------------------------------ |
| `{"nome": "item name"}`      | `ApplicationJason` | **Mandatory**. The name of the item you want |


Save the new item and list in endpoint /playlist with get method.

